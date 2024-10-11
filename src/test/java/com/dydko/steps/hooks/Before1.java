package com.dydko.steps.hooks;

import io.cucumber.java.Before;

public class Before1 {
    @Before
    public void before(){
        System.out.println("-- before --");
    }
}
