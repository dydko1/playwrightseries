package com.dydko.basic.reporterlog;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

    //setting expected title from the ebay.com
    static String expectedTitleebay = "Electronics, Cars, Fashion, Collectibles & More | eBay";

    public static void main(String[] args) throws InterruptedException {

//create the htmlReporter object 
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");
//create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
//creates a toggle for the given test, add all log events under it
        ExtentTest test1 = extent.createTest("ebay Search Test", "test to validate search box ");

//initializing and starting the browser
        test1.log(Status.INFO, "Starting test case");
//maximize the window 
        test1.pass("maximize has done");

        Thread.sleep(1000);
        test1.pass("Navigate to Ebay.com");

        test1.pass("title is correct");

        test1.pass("Entered thex in the text box");

        test1.pass("Press keybopard enter key");


        test1.pass("closed the browser");
        test1.info("test completed");

        //write results into the file
        extent.flush();
    }
}