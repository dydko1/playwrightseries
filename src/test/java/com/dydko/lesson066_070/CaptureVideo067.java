package com.dydko.lesson066_070;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.SelectOption;
import org.testng.annotations.Test;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class CaptureVideo067 {

    @Test()
    public void launchBrowser_2() throws InterruptedException {
        Playwright playwright = Playwright.create();
        List<String> arguments = Arrays.asList("--start-maximized");
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false).setArgs(arguments));
        BrowserContext context = browser.newContext(new Browser.NewContextOptions().setRecordVideoDir(Paths.get("c:\\temp")).setViewportSize(null));

        Page page = context.newPage();

        page.navigate("https://www.wikipedia.org/");


//select by value

        page.selectOption("select", "hi");



//select by text

        page.selectOption("select", new SelectOption().setLabel("Eesti"));




//select by index

        page.selectOption("select", new SelectOption().setIndex(1));


/*

Locator values = page.locator("select > option");

System.out.println(values.count());



for(int i=0; i<values.count(); i++) {


System.out.println(values.nth(i).innerText()+"----"+values.nth(i).getAttribute("lang"));



}*/
        List<ElementHandle> values = page.querySelectorAll("select > option");
        System.out.println(values.size());
        for(ElementHandle value: values) {
            System.out.println(value.innerText()+"----"+value.getAttribute("lang"));
        }
        page.close();
        context.close();
        playwright.close();
    }
}