package com.dydko.lesson075_083;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(final String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        logger.info("Hello World !!");
    }

    static {
        run1();
        run1("DDDDDDDDDDDDDDDDDDDDD");
    }

    private static void run1() {
        System.out.println("dddddddddddddddddddddddddddddddddddddddddddd");
    }

    private static void run1(String s) {
        System.out.println("ssssssssssss" + s);
    }
}