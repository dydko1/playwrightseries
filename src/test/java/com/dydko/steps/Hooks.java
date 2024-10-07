package com.dydko.steps;

import java.nio.file.Paths;

import com.microsoft.playwright.Page;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Hooks {
    @Before
    public void setUp() {
        log.info("\n----------\nBefore {}\n----------", "Before");
    }

    @After
    public void tearDown(Scenario scenario) {
        log.info("After", "After");
    }
}