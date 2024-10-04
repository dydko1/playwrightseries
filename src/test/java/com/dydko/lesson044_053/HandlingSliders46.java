package com.dydko.lesson044_053;

import com.microsoft.playwright.*;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class HandlingSliders46 {

    @Test()
    public void launchBrowser_2() throws InterruptedException {
        Playwright playwright = Playwright.create();
        List<String> arguments = Arrays.asList("--start-maximized");
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false).setArgs(arguments));
        BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));

        Page page = context.newPage();
        page.navigate("https://jqueryui.com/resources/demos/slider/default.html");

        Locator slider = page.locator("span");

        page.mouse().move(slider.boundingBox().x + slider.boundingBox().width / 2, slider.boundingBox().y + slider.boundingBox().height / 2);

        page.mouse().down();

        page.mouse().move(slider.boundingBox().x + 400, slider.boundingBox().y + slider.boundingBox().height / 2);

        page.mouse().up();

        page.close();
        playwright.close();
    }


}