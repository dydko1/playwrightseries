package com.dydko.basic;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.SelectOption;

public class TestHandlingDropdowns {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

        Page page = browser.newPage();
        page.navigate("https://www.wikipedia.org/");

        // select by val
        page.selectOption("select", "de");

        page.selectOption("select", new SelectOption().setLabel("Esperanto"));

        page.selectOption("select", new SelectOption().setIndex(3));

        Locator values = page.locator("select > option");
        for (int i = 0; i < values.count(); i++) {
            System.out.println(values.nth(i).innerText()+
                    "\t-----\t"+values.nth(i).getAttribute("lang"));
        }

        page.close();
        browser.close();
    }
}
