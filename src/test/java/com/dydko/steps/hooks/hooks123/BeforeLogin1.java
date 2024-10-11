package com.dydko.steps.hooks.hooks123;

import com.dydko.Model123;
import io.cucumber.java.Before;

public class BeforeLogin1 {

    private final Model123 model123;

    public BeforeLogin1(Model123 model123) {
        this.model123 = model123;
    }

    @Before(value = "@Pico123", order = 10)
    public void hook1() {
        model123
                .setName("Miro")
                .setLastName("Dydko");
        System.out.println("--------------------");
    }
}
