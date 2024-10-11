package com.dydko.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// mvn -Dtest=TestRunner2 test
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"com.dydko.steps"},
       // plugin = {"pretty"},
        tags = "@tag2"
)
public class TestRunner2 extends AbstractTestNGCucumberTests {
}