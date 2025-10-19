package com.dydko.tests;

import io.qameta.allure.testng.AllureTestNg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicSmokeTest {
    private static final Logger log = LoggerFactory.getLogger(BasicSmokeTest.class);

    @Test
    public void sanityCheck() {
        log.info("🚀 Starting sanityCheck test...");
        int a = 2 + 2;
        log.debug("Calculation done: a = {}", a);
        Assert.assertEquals(a, 4, "Simple sanity math test failed!");
        log.info("✅ sanityCheck test passed.");
    }

    @Test
    public void environmentCheck() {
        log.info("🧠 Checking environment variables...");
        String browser = System.getProperty("browser", "firefox");
        log.info("Current browser property: {}", browser);
        Assert.assertNotNull(browser);
    }
}
