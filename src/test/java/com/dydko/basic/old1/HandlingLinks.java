package com.dydko.basic;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.SelectOption;

public class HandlingLinks {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

        Page page = browser.newPage();
        page.navigate("https://www.wikipedia.org/");

        Locator links = page.locator("a");

        System.out.println(links.count());

        for (int i = 0; i < links.count(); i++) {

            System.out.println(links.nth(i).innerText() + "---URL: ----" + links.nth(i).getAttribute("href"));

        }

        Locator block = page.locator("//*[@id=\"www-wikipedia-org\"]/div[7]/div[3]");

        Locator blocklinks = block.locator("a");

        System.out.println("----Printing links from the block------");

        System.out.println(blocklinks.count());

        for (int i = 0; i < blocklinks.count(); i++) {

            System.out.println(blocklinks.nth(i).innerText() + "---URL: ----" + blocklinks.nth(i).getAttribute("href"));
        }
        page.close();
        browser.close();
    }
}
