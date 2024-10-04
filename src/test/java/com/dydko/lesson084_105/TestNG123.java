package com.dydko.lesson084_105;

import com.microsoft.playwright.*;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.internal.TestResult;

import java.util.Arrays;
import java.util.List;

@Listeners(Listener1.class)
public class TestNG123 {

    @Test(enabled = false)
    public void testcase1() {
        System.out.println("Testcase 1 - Not executed");
    }

    @Test
    public void testcase2() {
        System.out.println("Testcase 2 - skip exception example");
        throw new SkipException("Skipping this exception");
    }

    @Test
    public void testcase3() {
        System.out.println("Test Case3 - Conditional Skip");
        throw new SkipException("Skipping this exception");
    }

    @Test()
    public void testcase4() {
        System.out.println("Testcase 4 - Failed");
        Assert.assertTrue(false);
    }
}