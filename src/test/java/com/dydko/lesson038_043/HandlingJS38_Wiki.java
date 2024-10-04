package com.dydko.lesson038_043;

import com.microsoft.playwright.*;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class HandlingJS38_Wiki {

    @Test()
    public void launchBrowser_2() throws InterruptedException {
        Playwright playwright = Playwright.create();
        List<String> arguments = Arrays.asList("--start-maximized");
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false).setArgs(arguments));
        BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));

        Page page = context.newPage();
        page.navigate("https://rahulshettyacademy.com/AutomationPractice/");
        page.locator("#name").fill("Miro");
        page.locator("#alertbtn").click();
        page.onceDialog(Dialog::dismiss);
        page.close();
        playwright.close();
    }


}