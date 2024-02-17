package com.dydko.basic.reporterlog;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Slf4j
@Listeners
public class EmailReport {
    static ExtentTest test;
    static ExtentReports report;

    @Test(description = "test 1 passed")
    public void passTest() {
        report = new ExtentReports();
        test = report.createTest("ExtentDemo");
        test.log(Status.PASS, "Test Failed");

        Reporter.log("test1: 1");
        Reporter.log("test1: 2");
        Reporter.log("test1: 3");
        Reporter.log("test1: 4");
        Assert.assertTrue(true);
    }

    @Test(description = "test 2 failed")
    public void failTest() {
        Reporter.log("test10: 10");
        Reporter.log("test10: 20");
        Reporter.log("test10: 30");
        Reporter.log("test10: 40");
        Assert.assertTrue(false);
    }

    @Test(description = "test 3 skipped")
    public void skipTest() {
        Reporter.log("test100: 100");
        Reporter.log("test100: 200");
        Reporter.log("test100: 300");
        Reporter.log("test100: 400");
        throw new SkipException("Skipping -This method is skipped testing ");
    }
}
