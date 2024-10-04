package com.dydko.lesson054_065;

import com.microsoft.playwright.*;
import org.testng.annotations.Test;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class UploadonFile59 {

    @Test()
    public void launchBrowser_2() throws InterruptedException {
        Playwright playwright = Playwright.create();
        List<String> arguments = Arrays.asList("--start-maximized");
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false).setArgs(arguments));
        BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));

        Page page = context.newPage();
        page.navigate("https://www.way2automation.com/way2auto_jquery/registration.php#load_box");

        page.locator("#register_form > fieldset:nth-child(9) > input[type=file]").setInputFiles(Paths.get("src/test/resources/2024-09-14 08_59_49-.png"));

        page.close();
        playwright.close();
    }
}