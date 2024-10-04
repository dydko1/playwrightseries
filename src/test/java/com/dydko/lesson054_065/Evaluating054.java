package com.dydko.lesson054_065;

import com.microsoft.playwright.*;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Evaluating054 {

    @Test()
    public void launchBrowser_2() throws InterruptedException {
        Playwright playwright = Playwright.create();
        List<String> arguments = Arrays.asList("--start-maximized");
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false).setArgs(arguments));
        BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));

        Page page = context.newPage();
        page.navigate("http://google.com");


        System.out.println(page.evaluate("document.location.href"));

        page.evaluate("() => {"
                + "const textarea = document.createElement('textarea');"
                + "document.body.append(textarea);"
                + "textarea.focus();"
                +"}");

        String text = "Hello World !!";
        page.keyboard().type(text);

        page.close();
        playwright.close();
    }
}