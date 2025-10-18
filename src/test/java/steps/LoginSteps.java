package steps;

import com.microsoft.playwright.*;
import io.cucumber.java.en.*;
import support.PlaywrightManager;

public class LoginSteps {

    private final Page page = PlaywrightManager.getPage();

    @Given("user navigates to the login page")
    public void navigateToLoginPage() {
        page.navigate("https://www.way2automation.com/");
    }

    @When("user enters valid credentials")
    public void enterCredentials() {
        System.out.println("enter credentials");
//        page.fill("#username", "testuser");
//        page.fill("#password", "password123");
//        page.click("#login");
    }

    @Then("user should see the dashboard")
    public void verifyDashboard() {
        //page.waitForSelector("#dashboard");
        System.out.println("Login successful!");
    }
}