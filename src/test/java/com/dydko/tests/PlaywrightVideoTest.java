package com.dydko.tests;

import com.microsoft.playwright.*;
import io.qameta.allure.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//@Epic("UI Tests")
//@Feature("Playwright video & screenshot reporting")
public class PlaywrightVideoTest {

    private static final Logger log = LoggerFactory.getLogger(PlaywrightVideoTest.class);

    private Playwright playwright;
    private Browser browser;
    private BrowserContext context;
    private Page page;

    private boolean headless;
    private boolean recordVideo;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        headless = Boolean.parseBoolean(System.getProperty("headless", "true"));
        recordVideo = Boolean.parseBoolean(System.getProperty("recordVideo", "true"));

        log.info("🎬 Headless mode: {}", headless);
        log.info("🎥 Record video: {}", recordVideo);

        playwright = Playwright.create();

        BrowserType.LaunchOptions launchOptions = new BrowserType.LaunchOptions()
                .setHeadless(headless);

        browser = playwright.firefox().launch(launchOptions);

        Browser.NewContextOptions contextOptions = new Browser.NewContextOptions();

        if (recordVideo) {
            Path videoDir = Paths.get("target/videos");
            contextOptions.setRecordVideoDir(videoDir);
            log.info("📁 Video output directory: {}", videoDir.toAbsolutePath());
        }

        context = browser.newContext(contextOptions);
        page = context.newPage();
    }

    @Test(description = "Verify Playwright.dev loads correctly and captures video/screenshot")
    @Story("Video + Screenshot test")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Opens playwright.dev, checks title, records video, and takes screenshots on all outcomes.")
    public void verifyPlaywrightPage() {
        log.info("🌐 Navigating to Playwright.dev...");
        page.navigate("https://playwright.dev");

        String title = page.title();
        log.info("📄 Page title: {}", title);

        Allure.step("Navigate to Playwright.dev");
        Allure.step("Verify page title: " + title);

        Assert.assertTrue(title.toLowerCase().contains("playwright"), "Title should contain 'Playwright'");
    }

    @AfterMethod(alwaysRun = true)
    public void captureArtifacts(ITestResult result) {
        String testName = result.getName();
        boolean testFailed = !result.isSuccess();

        try {
            // Screenshot zawsze, także przy sukcesie
            byte[] screenshot = page.screenshot(new Page.ScreenshotOptions().setFullPage(true));
            String attachmentName = testFailed
                    ? "❌ Screenshot on Failure - " + testName
                    : "✅ Screenshot on Success - " + testName;
            Allure.addAttachment(attachmentName, new ByteArrayInputStream(screenshot));
            log.info("📸 Screenshot saved for test: {}", testName);
        } catch (Exception e) {
            log.warn("⚠️ Could not capture screenshot for {}: {}", testName, e.getMessage());
        }

        // Dołączenie wideo, jeśli włączone
        if (recordVideo && page != null) {
            try {
                page.close();
                Path videoPath = page.video() != null ? page.video().path() : null;
                context.close();
                browser.close();
                playwright.close();

                if (videoPath != null && Files.exists(videoPath)) {
                    log.info("🎞️ Attaching video to Allure report: {}", videoPath);
                    Allure.addAttachment(
                            "🎬 Playwright Video - " + testName,
                            "video/webm",
                            new ByteArrayInputStream(Files.readAllBytes(videoPath)),
                            "webm"
                    );
                } else {
                    log.warn("⚠️ No video file found for attachment.");
                }
            } catch (IOException e) {
                log.error("❌ Failed to attach video: {}", e.getMessage());
            } catch (Exception ex) {
                log.warn("⚠️ Exception during video attach: {}", ex.getMessage());
            }
        } else {
            log.info("🎥 Video recording disabled; skipping attachment.");
        }
    }

    @AfterClass(alwaysRun = true)
    public void teardown() {
        try {
            if (context != null) context.close();
            if (browser != null) browser.close();
            if (playwright != null) playwright.close();
        } catch (Exception e) {
            log.warn("⚠️ Cleanup issue: {}", e.getMessage());
        }
    }
}
