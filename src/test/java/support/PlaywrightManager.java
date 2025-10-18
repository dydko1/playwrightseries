package support;

import com.microsoft.playwright.*;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class PlaywrightManager {

    private static final ThreadLocal<Playwright> playwrightThread = new ThreadLocal<>();
    private static final ThreadLocal<Browser> browserThread = new ThreadLocal<>();
    private static final ThreadLocal<BrowserContext> contextThread = new ThreadLocal<>();
    private static final ThreadLocal<Page> pageThread = new ThreadLocal<>();

    private static final List<String> arguments = List.of("--start-maximized");

    // 🔹 Domyślnie Firefox, można zmienić: -Dbrowser=chrome lub webkit
    private static final String BROWSER = System.getProperty("browser", "firefox");
    private static final boolean HEADLESS = Boolean.parseBoolean(System.getProperty("headless", "false"));

    public static Page getPage() {
        if (pageThread.get() == null) {
            long threadId = Thread.currentThread().getId();
            log.info("🚀 Launching Playwright [{} - headless={}] in thread: {}", BROWSER, HEADLESS, threadId);

            Playwright playwright = Playwright.create();
            Browser browser;

            switch (BROWSER.toLowerCase()) {
                case "chrome":
                    browser = playwright.chromium().launch(
                            new BrowserType.LaunchOptions()
                                    .setChannel("chrome")
                                    .setHeadless(HEADLESS)
                                    .setArgs(arguments)
                    );
                    break;
                case "webkit":
                    browser = playwright.webkit().launch(
                            new BrowserType.LaunchOptions()
                                    .setHeadless(HEADLESS)
                                    .setArgs(arguments)
                    );
                    break;
                default: // ✅ Firefox domyślnie
                    browser = playwright.firefox().launch(
                            new BrowserType.LaunchOptions()
                                    .setChannel("firefox")
                                    .setHeadless(HEADLESS)
                                    .setArgs(arguments)
                    );
                    break;
            }

            BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
            Page page = context.newPage();

            playwrightThread.set(playwright);
            browserThread.set(browser);
            contextThread.set(context);
            pageThread.set(page);

            // 🔹 Domyślne timeouty
            page.setDefaultTimeout(7000);
            page.setDefaultNavigationTimeout(15000);

            log.info("✅ Browser [{}] started successfully for thread {}", BROWSER, threadId);
        }

        return pageThread.get();
    }

    public static void close() {
        long id = Thread.currentThread().getId();
        log.info("🧩 Closing Playwright in thread: {}", id);

        try {
            if (pageThread.get() != null) {
                pageThread.get().close();
                pageThread.remove();
                log.debug("Page closed");
            }
            if (contextThread.get() != null) {
                contextThread.get().close();
                contextThread.remove();
                log.debug("Browser context closed");
            }
            if (browserThread.get() != null) {
                browserThread.get().close();
                browserThread.remove();
                log.debug("Browser closed");
            }
            if (playwrightThread.get() != null) {
                playwrightThread.get().close();
                playwrightThread.remove();
                log.debug("Playwright closed");
            }
            log.info("✅ Playwright cleanup completed for thread {}", id);

        } catch (Exception e) {
            log.error("⚠️ Error during Playwright cleanup: ", e);
        }
    }
}
