package com.dydko.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features",
        glue = {"com/dydko/steps"},
        plugin = {"html:target/cucumber-reports1/cucumber-html-report.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty"},
        tags = "@release1",
        dryRun = false)
public class RunCuke extends AbstractTestNGCucumberTests {

}
