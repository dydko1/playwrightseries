package com.dydko.lesson012_022;

import com.microsoft.playwright.*;
import org.testng.annotations.Test;

public class LaunchBrowser1 {

    @Test()
    public void launchBrowser_1() {
        Playwright playwright = Playwright
                .create();
        Browser browser = playwright.chromium()
                .launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext browserContext = browser.newContext(new Browser.NewContextOptions().setViewportSize(1920, 1080));
        Page page = browserContext.newPage();
        page.navigate("https://www.way2automation.com/");
        System.out.println(page.title());
        page.close();
        playwright.close();
    }
}