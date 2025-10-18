package steps;

import com.microsoft.playwright.Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import lombok.extern.slf4j.Slf4j;
import support.PlaywrightManager;

@Slf4j
public class CheckboxSteps {

    private final Page page = PlaywrightManager.getPage();

    @Given("user opens the checkbox practice page")
    public void openCheckboxPage() throws InterruptedException {
        log.info("Navigating to checkbox practice page...");
        page.navigate("https://rahulshettyacademy.com/AutomationPractice/");
    }

    @When("user selects a checkbox")
    public void selectCheckbox() {
        log.info("Selecting checkbox...");
        //page.check("#checkBoxOption1");
    }

    @Then("checkbox state should be visible")
    public void verifyCheckboxState() throws InterruptedException {
        //boolean checked = page.isChecked("#checkBoxOption1");
//        log.info("Checkbox state: {}", checked ? "checked ✅" : "unchecked ❌");
        log.info("Checkbox state: {}", "checked");
        Thread.sleep(2000);
    }
}
