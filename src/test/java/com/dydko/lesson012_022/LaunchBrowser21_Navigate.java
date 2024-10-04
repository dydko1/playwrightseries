package com.dydko.lesson012_022;

import com.microsoft.playwright.*;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class LaunchBrowser21_Navigate {

    @Test()
    public void launchBrowser_2() {
        Playwright playwright = Playwright.create();
        List<String> arguments = Arrays.asList("--start-maximized");
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false).setArgs(arguments));
        BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));

        Page page = context.newPage();
        page.navigate("https://www.way2automation.com/");
        System.out.println(page.title());
        page.navigate("https://www.google.com/");
        System.out.println(page.title());
        page.close();
        playwright.close();
    }
}