package com.dydko.lesson075_083;

import com.microsoft.playwright.*;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

@Slf4j
public class Logger75 {

    @Test()
    public void launchBrowser_2() throws InterruptedException {
        Playwright playwright = Playwright.create();
        List<String> arguments = Arrays.asList("--start-maximized");
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false).setArgs(arguments));
        BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));

        log.info("Tu był Miro {}", "argument123");

        Page page = context.newPage();
        page.navigate("https://jqueryui.com/resources/demos/droppable/default.html");

        Locator draggable = page.locator("#draggable");
        Locator droppable = page.locator("#droppable");

        page.mouse().move(draggable.boundingBox().x + draggable.boundingBox().width / 2,
                draggable.boundingBox().y + draggable.boundingBox().height / 2);
        page.mouse().down();
        page.mouse().move(droppable.boundingBox().x + droppable.boundingBox().width / 2,
                droppable.boundingBox().y + droppable.boundingBox().height / 2);
        page.mouse().up();

        page.close();
        playwright.close();
    }



}