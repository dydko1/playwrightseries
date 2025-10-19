package com.dydko.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApiHealthTest {
  private static final Logger log = LoggerFactory.getLogger(ApiHealthTest.class);

  @Test
  public void apiPing() {
    log.info("🌐 Sending fake API ping...");
    int responseCode = 200;
    log.info("API responded with code {}", responseCode);
    Assert.assertEquals(responseCode, 200, "API is not healthy!");
  }

  @Test
  public void apiUnauthorized() {
    log.info("🔒 Checking unauthorized response...");
    int responseCode = 401;
    log.warn("API returned {} for unauthorized user", responseCode);
    Assert.assertEquals(responseCode, 401);
  }
}
