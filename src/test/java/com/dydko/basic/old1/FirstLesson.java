package com.dydko.basic.old1;

import com.microsoft.playwright.*;

import java.util.ArrayList;

public class FirstLesson {
    public static void main(String[] args) throws InterruptedException {
        Playwright playwright = Playwright.create();
        ArrayList<String> arguments = new ArrayList<>();
        arguments.add("--start-maximized");
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setArgs(arguments));
        BrowserContext browserContext = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
        Thread.sleep(1000);
        Page page = browserContext.newPage();
        page.navigate("https://www.onet.pl/");
        System.out.println(page.title());
        page.close();
        browser.close();
    }
}