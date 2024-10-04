package com.dydko.lesson023_031;

import com.microsoft.playwright.*;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class HandlingLinks28_Wiki {

    @Test()
    public void launchBrowser_2() {
        Playwright playwright = Playwright.create();
        List<String> arguments = Arrays.asList("--start-maximized");
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false).setArgs(arguments));
        BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));

        Page page = context.newPage();
        page.navigate("https://www.wikipedia.org/");
        Locator links = page.locator("a");

        for (int i = 0; i < links.count(); i++) {
            System.out.println("-----------");
            System.out.println(links
                    .nth(i)
                    .getAttribute("href"));
            System.out.println("-----------");
        }
        page.close();
        playwright.close();
    }


}