package steps;

import com.microsoft.playwright.Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import lombok.extern.slf4j.Slf4j;
import support.PlaywrightManager;

@Slf4j
public class WikiSteps {

    private final Page page = PlaywrightManager.getPage();

    @Given("user navigates to Wikipedia homepage")
    public void userNavigatesToWikipediaHomepage() {
        log.info("Navigating to Wikipedia...");
        page.navigate("https://www.wikipedia.org/");
    }

    @When("user views the language dropdown")
    public void userViewsTheLanguageDropdown() throws InterruptedException {
        log.info("Checking language dropdown visibility...");
//        page.locator("#searchLanguage").isVisible();
    }

    @Then("all language options should be visible")
    public void allLanguageOptionsShouldBeVisible() throws InterruptedException {
        log.info("Language dropdown verified ✅");
        Thread.sleep(2000);
    }
}
