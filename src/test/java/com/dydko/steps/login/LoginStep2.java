package com.dydko.steps.login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStep2 {

    @Given("User navigate to page2")
    public void userNavigateTo() {
        System.out.println("Step 10");
    }

    @And("User enter login and password2")
    public void userEnterLoginAndPassword() {
        System.out.println("Step 20");
    }

    @And("User click on login button2")
    public void userClickOnLoginButton() {
        System.out.println("Step 30");
    }

    @Then("User is login2")
    public void userIsLogin() {
        System.out.println("Step 40");
    }
}
