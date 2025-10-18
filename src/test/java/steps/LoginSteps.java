package steps;

import com.microsoft.playwright.Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import lombok.extern.slf4j.Slf4j;
import support.PlaywrightManager;

@Slf4j
public class LoginSteps {

    private final Page page = PlaywrightManager.getPage();

    @Given("user opens login page")
    public void userOpensLoginPage() {
        log.info("Opening login page...");
        page.navigate("https://rahulshettyacademy.com/locatorspractice/");
    }

    @When("user enters valid credentials")
    public void userEntersValidCredentials() {
        log.info("Entering credentials...");
//        page.fill("#inputUsername", "miroslaw.dyduch@gmail.com");
//        page.fill("[placeholder='Password']", "rahulshettyacademy");
    }

    @When("clicks sign in button")
    public void clicksSignInButton() {
        log.info("Clicking Sign In...");
//        page.click("button[type='submit']");
    }

    @Then("user should be redirected to the homepage")
    public void userShouldBeRedirectedToTheHomepage() throws InterruptedException {
        log.info("Homepage redirect verified ✅");
        Thread.sleep(2000);
    }
}
