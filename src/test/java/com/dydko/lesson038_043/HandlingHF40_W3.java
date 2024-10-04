package com.dydko.lesson038_043;

import com.microsoft.playwright.*;
import com.microsoft.playwright.Locator.ClickOptions;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class HandlingHF40_W3 {

    @Test()
    public void launchBrowser_2() throws InterruptedException {
        Playwright playwright = Playwright.create();
        List<String> arguments = Arrays.asList("--start-maximized");
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false).setArgs(arguments));
        BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));

        Page page = context.newPage();
        page.navigate("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
        page.locator("#accept-choices").click();
        page.frameLocator("[name='iframeResult']").locator("body > button").click(new ClickOptions().setTimeout(2000));

        Locator frames = page.locator("iframe");
        page.close();
        playwright.close();
    }


}