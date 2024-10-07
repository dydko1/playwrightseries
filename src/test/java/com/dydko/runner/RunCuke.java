package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features",
        glue = {"steps"},
        plugin = "html:target/cucumber-reports1/cucumber-html-report.html",
        dryRun = false,
        tags = "")
public class RunCuke extends AbstractTestNGCucumberTests {

}
