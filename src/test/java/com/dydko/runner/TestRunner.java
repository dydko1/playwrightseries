package com.dydko.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"com.dydko.steps"},
        //plugin = {"pretty"},
        tags = "@tag1"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}