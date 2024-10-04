package com.dydko.lesson084_105;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener1 implements ITestListener {
    public void onTestStart(ITestResult result) {
        System.out.println("Start testu !!!!!!!!!!!!!!");
        System.setProperty("org.uncommons.reportng.escape-output", "false");
        Reporter.log("<a href=\"C:\\temp\\sce2.png\" target=\"_blank\">Screenshot link</a>");
        Reporter.log("<br>");
        Reporter.log("<a href=\"C:\\temp\\sce2.png\" target=\"_blank\"><img height=200 width=200 src=\"C:\\temp\\sce2.png\"></a>");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Passed Test - " + result.getName());
    }

    public void onTestFailure(ITestResult result) {

        System.setProperty("org.uncommons.reportng.escape-output", "false");
        Reporter.log("<a href=\"C:\\temp\\sce.png\" target=\"_blank\">Screenshot link</a>");
        Reporter.log("<br>");
        Reporter.log("<a href=\"C:\\temp\\sce.png\" target=\"_blank\"><img height=200 width=200 src=\"C:\\temp\\sce.png\"></a>");

        System.out.println("Capturing Screenshot for the Failed test -- " + result.getName());

    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("skippppppp");
        // TODO Auto-generated method stub

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub

    }

    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub

    }

    public void onFinish(ITestContext context) {
        // TODO Auto-generated method stub

    }
}
