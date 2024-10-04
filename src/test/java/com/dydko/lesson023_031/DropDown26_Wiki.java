package com.dydko.lesson023_031;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.SelectOption;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class DropDown26_Wiki {

    @Test()
    public void launchBrowser_2() {
        Playwright playwright = Playwright.create();
        List<String> arguments = Arrays.asList("--start-maximized");
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false).setArgs(arguments));
        BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));

        Page page = context.newPage();
        page.navigate("https://www.wikipedia.org/");
        List<ElementHandle> val = page.querySelectorAll("#searchLanguage > option");
//        page.selectOption("#searchLanguage", "Ladin");
//        page.selectOption("#searchLanguage", new SelectOption().setIndex(1));
        for (ElementHandle s : val) {
            System.out.println(s
                    .getAttribute("lang"));
        }
        page.close();
        playwright.close();
    }


}