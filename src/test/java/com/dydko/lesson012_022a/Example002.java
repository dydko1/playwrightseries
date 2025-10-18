package com.dydko.lesson012_022a;

import com.microsoft.playwright.*;

import java.util.List;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class Example002 {
  public static void main(String[] args) {
    try (Playwright playwright = Playwright.create()) {
      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
        .setHeadless(false));
      BrowserContext context = browser.newContext();
      Page page = context.newPage();
      page.navigate("https://www.wp.pl/");

      List<String> amazonLinks = page.locator("a:has-text('nie')").allInnerTexts();
      amazonLinks.forEach(System.out::println);

      page.close();
      browser.close();
      playwright.close();
    }
  }
}