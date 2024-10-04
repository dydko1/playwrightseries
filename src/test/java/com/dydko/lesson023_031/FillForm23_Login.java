package com.dydko.lesson023_031;

import com.microsoft.playwright.*;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class FillForm23_Login {

    @Test()
    public void launchBrowser_2() {
        Playwright playwright = Playwright.create();
        List<String> arguments = Arrays.asList("--start-maximized");
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false).setArgs(arguments));
        BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));

        Page page = context.newPage();
        page.navigate("https://rahulshettyacademy.com/locatorspractice/");
        page.locator("#inputUsername").fill("miroslaw.dyduch@gmail.com");
        page.locator("[placeholder='Password']").fill("rahulshettyacademy");
        page.locator("label[for='chkboxOne']").click();
        page.locator("label[for='chkboxTwo']").click();
        page.locator(clickSignIn()).click();
        page.close();
        playwright.close();
    }
    
    private String clickSignIn(){
        //return "button:has-text(\"Dalej\")";
        return "button[type='submit']";
    }
}