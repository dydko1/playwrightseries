package com.dydko.lesson044_053;

import com.microsoft.playwright.*;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class HandlingShadowDom {

    @Test()
    public void launchBrowser_2() throws InterruptedException {
        Playwright playwright = Playwright.create();
        List<String> arguments = Arrays.asList("--start-maximized");
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false).setArgs(arguments));
        BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));

        Page page = context.newPage();
        page.navigate("chrome://downloads/");


        page.locator("#searchInput").fill("Java");

        page.close();
        playwright.close();
    }


}