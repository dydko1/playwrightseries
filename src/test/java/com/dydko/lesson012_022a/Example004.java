package com.dydko.lesson012_022a;

import com.microsoft.playwright.*;

import java.util.List;

public class Example004 {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(1920, 1080));
            Page page = context.newPage();
            page.navigate("https://datatables.net/extensions/select/examples/checkbox/checkbox.html");

            Locator table = page.locator("table#example tr");
            //Locator t=
            table.locator(":scope", new Locator.LocatorOptions()
                            //.filter(new Locator.FilterOptions())
                            .setHasText("Ashton Cox"))

                    //.setHasText("Ashton Cox"));
                    .locator(".dt-select-checkbox")
                    .click();

            //t.allInnerTexts().forEach(System.out::println);

            page.close();
            browser.close();
            playwright.close();
        }
    }
}