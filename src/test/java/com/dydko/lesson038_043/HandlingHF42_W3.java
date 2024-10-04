package com.dydko.lesson038_043;

import com.microsoft.playwright.*;
import com.microsoft.playwright.Locator.ClickOptions;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class HandlingHF42_W3 {

    @Test()
    public void launchBrowser_2() throws InterruptedException {
        Playwright playwright = Playwright.create();
        List<String> arguments = Arrays.asList("--start-maximized");
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false).setArgs(arguments));
        BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));

        Page page = context.newPage();
        page.navigate("https://sso.teachable.com/secure/673/identity/sign_up/email");
        Page popup = page.waitForPopup(() -> {
            page.locator("text=Privacy Policy").nth(0).click();
        });
        popup.locator("//*[@id=\"header-sign-up-btn\"]").click();
        popup.locator("#user_name").type("Rahul Arora");

        page.close();
        playwright.close();
    }


}