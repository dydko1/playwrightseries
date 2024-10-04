package com.dydko.lesson044_053;

import com.microsoft.playwright.*;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class HandlingMouse44 {

    @Test()
    public void launchBrowser_2() throws InterruptedException {
        Playwright playwright = Playwright.create();
        List<String> arguments = Arrays.asList("--start-maximized");
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false).setArgs(arguments));
        BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));

        Page page = context.newPage();
        page.navigate("https://www.way2automation.com/");

        //page.locator("#elementor-popup-modal-26600 > div > a").click();
        //page.locator("//*[@id=\"menu-item-27580\"]/a/span[2]").hover();
        page.locator("#menu-item-27580 span:has-text('All Courses')").hover();
        page.locator("#menu-item-27592 span.menu-text:has-text('DevOps')").click();
        //page.locator("//*[@id=\"menu-item-27592\"]/a").click();


        page.close();
        playwright.close();
    }


}