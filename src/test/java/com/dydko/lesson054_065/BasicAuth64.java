package com.dydko.lesson054_065;

import com.microsoft.playwright.*;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class BasicAuth64 {

    @Test()
    public void launchBrowser_2() throws InterruptedException {
        Playwright playwright = Playwright.create();
        List<String> arguments = Arrays.asList("--start-maximized");
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false).setArgs(arguments));
        BrowserContext context =
                browser.newContext(new Browser.NewContextOptions().setViewportSize(null).setHttpCredentials("admin", "admin"));

        Page page = context.newPage();
        page.navigate("http://the-internet.herokuapp.com/basic_auth");

        page.close();
        playwright.close();
    }
}