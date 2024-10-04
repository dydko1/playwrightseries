package com.dydko.lesson023_031;

import com.microsoft.playwright.*;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class HandlinCheckBox30_Wiki {

    @Test()
    public void launchBrowser_2() {
        Playwright playwright = Playwright.create();
        List<String> arguments = Arrays.asList("--start-maximized");
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false).setArgs(arguments));
        BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));

        Page page = context.newPage();
        page.navigate("https://rahulshettyacademy.com/AutomationPractice/");
//        Locator l = page.locator("#checkBoxOption1");
        Locator l = page.locator("//input[@id='checkBoxOption1']");
        if (!l.isChecked()) {
            System.out.println("Check");
            l.check();
        } else {
            System.out.println("Uncheck");
        }

        //.isChecked()
        //.click();
        //.check();
        page.close();
        playwright.close();
    }


}