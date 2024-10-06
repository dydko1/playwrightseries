package com.dydko;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PojoTest {

    BusinessClass businessClass = new BusinessClass();

    @BeforeMethod
    public void setUp() {
        businessClass.run();
    }

    @Test
    public void testInPojo1() {
        System.out.println("First test");
        assert "Java".equals(businessClass.concat("Java"));
    }

    @Test
    public void testInPojo2() {
        System.out.println("Second test");
        assert "Java 17".equals(businessClass.concat("Java", "17"));
    }

    @Test
    public void testInPojo3() {
        System.out.println("Third test");
        assert "Java".equals(businessClass.concat("Java", "17"));
    }

    @AfterMethod
    public void tearDown() {
        businessClass.stop();
    }
}