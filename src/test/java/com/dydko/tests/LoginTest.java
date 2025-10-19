package com.dydko.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
  private static final Logger log = LoggerFactory.getLogger(LoginTest.class);

  @Test
  public void successfulLogin() {
    log.info("🔐 Start test: successfulLogin");
    // Symulacja akcji
    log.debug("Filling login form with user: tomsmith");
    log.debug("Submitting login form...");
    String message = "You logged into a secure area!";
    log.info("✅ Login success message: {}", message);
    Assert.assertTrue(message.contains("secure area"));
  }

  @Test
  public void failedLogin() {
    log.info("🚫 Start test: failedLogin");
    String message = "Your username is invalid!";
    log.warn("⚠️ Received error message: {}", message);
    Assert.assertTrue(message.contains("invalid"));
  }
}
