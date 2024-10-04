package com.dydko.lesson054_065;

import com.microsoft.playwright.*;
import org.testng.annotations.Test;
import com.microsoft.playwright.Locator.TypeOptions;

import java.util.Arrays;
import java.util.List;

public class KayboardHandling054 {

    @Test()
    public void launchBrowser_2() throws InterruptedException {
        Playwright playwright = Playwright.create();
        List<String> arguments = Arrays.asList("--start-maximized");
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false).setArgs(arguments));
        BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));

        Page page = context.newPage();
        page.navigate("https://login.yahoo.com/");
        page.locator("#login-username").type("trainer@way2automation", new TypeOptions().setDelay(100));

        for(int i=0; i<3; i++) {

            page.keyboard().press("ArrowLeft");
            page.keyboard().press("Control+A");
            page.keyboard().press("Control+X");
            page.keyboard().press("Control+V");
            Thread.sleep(500);

        }
        page.close();
        playwright.close();
    }
}