package support;

import com.microsoft.playwright.*;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class PlaywrightManager {
    private static Playwright playwright;
    private static Browser browser;
    private static BrowserContext context;
    private static Page page;

    private static final List<String> arguments = List.of("--start-maximized");

    public static Page getPage() {
        if (page == null) {
            log.info("Launching default browser (Chromium)");

            playwright = Playwright.create();
            browser = playwright.chromium().launch(
                    new BrowserType.LaunchOptions()
                            .setHeadless(false)
                            .setArgs(arguments)
            );

            context = browser.newContext(
                    new Browser.NewContextOptions().setViewportSize(null)
            );
            page = context.newPage();

            log.info("Browser (Chromium) started successfully");

            // automatyczne zamykanie przy zakończeniu JVM (np. stop w IntelliJ)
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                try {
                    close();
                    log.info("Playwright closed via shutdown hook.");
                } catch (Exception e) {
                    log.error("Error closing Playwright during shutdown", e);
                }
            }));
        }
        return page;
    }

    public static void close() {
        log.info("Attempting to close Playwright...");
        try {
            if (page != null) {
                page.close();
                page = null;
                log.info("Page closed");
            }

            if (context != null) {
                context.close();
                context = null;
                log.info("Browser context closed");
            }

            if (browser != null) {
                Thread browserCloser = new Thread(() -> {
                    try {
                        browser.close();
                        log.info("Browser closed");
                    } catch (PlaywrightException e) {
                        if (e.getMessage().contains("connection closed")) {
                            log.warn("Browser already closed (Playwright connection closed)");
                        } else {
                            log.error("Error while closing browser", e);
                        }
                    } catch (Exception e) {
                        log.error("Error while closing browser", e);
                    }
                });
                browserCloser.start();
                browserCloser.join(5000);
                if (browserCloser.isAlive()) {
                    log.warn("Browser did not close within timeout — will exit naturally soon...");
                }
                browser = null;
            }

            if (playwright != null) {
                try {
                    playwright.close();
                    log.info("Playwright closed");
                } catch (Exception e) {
                    log.error("Error closing Playwright: ", e);
                } finally {
                    playwright = null;
                }
            }

            log.info("Playwright resources released successfully.");

        } catch (Exception e) {
            log.error("Error while closing Playwright: ", e);
        }
    }
}
