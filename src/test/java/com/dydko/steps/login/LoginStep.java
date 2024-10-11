package com.dydko.steps.login;

import com.dydko.Model123;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStep {
    private final Model123 model123;

    public LoginStep(Model123 model123) {
        this.model123 = model123;
    }

    @Given("User navigate to page")
    public void userNavigateTo() {
        System.out.println("Step 1");
    }

    @And("User enter login and password")
    public void userEnterLoginAndPassword() {
        System.out.println("Step 2");
        System.out.println("Login " + model123.getName());
        System.out.println("Login " + model123.getLastName());
    }

    @And("User click on login button")
    public void userClickOnLoginButton() {
        System.out.println("Step 3");
    }

    @Then("User is login")
    public void userIsLogin() {
        System.out.println("Step 4");
    }


}
