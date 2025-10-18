package com.dydko.lesson012_022a;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import java.nio.file.Paths;

public class Example001 {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext();
            context.tracing().start(new Tracing.StartOptions().setSources(true).setScreenshots(true).setSnapshots(true));
            Page page = context.newPage();
            page.navigate("https://www.interia.pl/");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Przejdź do serwisu")).click();
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Trump postawił sprawę jasno.")).click();
            page.getByText("Przejdź do artykułu").click();
            Page page1 = page.waitForPopup(() -> {
                page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("stronie głównej Interii")).click();
            });


            context.tracing().stop(new Tracing.StopOptions().setPath(Paths.get("trace.zip")));
            page1.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Kandydat z podium notuje")).click();
            page.close();
            browser.close();
            //playwright.close();
        }
    }
}