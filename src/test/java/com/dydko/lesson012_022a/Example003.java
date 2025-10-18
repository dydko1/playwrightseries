package com.dydko.lesson012_022a;

import com.microsoft.playwright.*;

import java.util.List;

public class Example003 {
  public static void main(String[] args) {
    try (Playwright playwright = Playwright.create()) {
      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
        .setHeadless(false));
      BrowserContext context = browser.newContext();
      Page page = context.newPage();
      page.navigate("http://www.automationpractice.pl/index.php?id_category=8&controller=category");

      List<String> amazonLinks = page.locator("span.price.product-price:below(:text('Printed Dress'))").allInnerTexts();
      amazonLinks.forEach(System.out::println);

      page.close();
      browser.close();
      playwright.close();
    }
  }
}