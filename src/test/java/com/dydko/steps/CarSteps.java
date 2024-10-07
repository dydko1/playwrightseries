package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CarSteps {

    @Given("user navigates to carwale website")
    public void user_navigates_to_carwale_website() {
        log.info("Step_1 {}", "user navigates to carwale website");
    }

    @When("user mouseover to newcars")
    public void user_mouseover_to_newcars() {
        log.info("Step_2 {}", "user mouseover to newcars");
    }

    @Then("user clicks on Find new cars link")
    public void user_clicks_on_findnewcars_link() {
        log.info("Step_3 {}", "user clicks on Findnewcars link");
    }

    @Then("user clicks on {string} car")
    public void user_clicks_on_car(String carName) {
        log.info("Step_4 {}", carName);
    }

    @Then("user validates carTitle as {string}")
    public void user_validates_car_title_as(String carDescription) {
        log.info("Step_5 {}", carDescription);
    }
}
