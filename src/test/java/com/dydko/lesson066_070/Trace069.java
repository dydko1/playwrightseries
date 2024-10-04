package com.dydko.lesson066_070;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.SelectOption;
import org.testng.annotations.Test;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Trace069 {

    @Test()
    public void launchBrowser_2() throws InterruptedException {
        Playwright playwright = Playwright.create();
        List<String> arguments = Arrays.asList("--start-maximized");
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false).setArgs(arguments));
        BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
        context.tracing().start(new Tracing.StartOptions()
                .setScreenshots(true)
                .setSnapshots(true));
        Page page = context.newPage();
        page.navigate("http://www.onet.pl");

        //page.locator("#identifierId").type("trainer@way2automation.com");
        //page.locator("[id='identifierId']").type("trainer@way2automation.com");
        //page.type("id=identifierId", "trainer@way2automation.com", new TypeOptions().setDelay(100));
        //page.locator("[type=email]").type("trainer@way2automation.com");
        //page.click("text=Next");
        //page.click("button:has-text('Next')");
        //page.locator("[type=password]").fill("sdfsdfdsf");
        //page.click("button:has-text('Next')");
        //System.out.println(page.locator("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div[2]/span").innerText());

        // Stop tracing and export it into a zip archive.
        context.tracing().stop(new Tracing.StopOptions()
                .setPath(Paths.get("trace.zip")));

        page.close();
        context.close();
        playwright.close();
    }
}