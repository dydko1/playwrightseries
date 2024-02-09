package com.dydko.basic;

import com.microsoft.playwright.Browser;

import com.microsoft.playwright.BrowserType;

import com.microsoft.playwright.Page;

import com.microsoft.playwright.Playwright;


import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;


public class HandlingWebTables {


    public static void main(String[] args) {


        Playwright playwright = Playwright.create();

        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));


        Page page = browser.newPage();

        page.navigate("https://money.rediff.com/indices/nse/NIFTY-50?src=moneyhome_nseIndices");

//Row count

        System.out.println(page.locator(".dataTable > tbody").locator("tr").count());

//col count

        page.locator("body > div.fc-consent-root > div.fc-dialog-container > div.fc-dialog.fc-choice-dialog > div.fc-footer-buttons-container > div.fc-footer-buttons > button.fc-button.fc-cta-consent.fc-primary-button").click();

        System.out.println(page.locator(".dataTable > tbody").locator("tr:first-child").locator("td").count());

        assertThat(page.locator(".dataTable > tbody").locator("tr:first-child").locator("td:nth-child(2)")).hasText("Nifty");


        page.locator(".dataTable > tbody").allInnerTexts().forEach(text -> System.out.println(text));

    }


}

