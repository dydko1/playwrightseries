package com.dydko.steps.hooks;

import io.cucumber.java.After;

public class After1 {

    @After
    public void before() {
        System.out.println("-- after --");
    }
}
