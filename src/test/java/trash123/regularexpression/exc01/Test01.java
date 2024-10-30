package trash123.regularexpression.exc01;

import org.testng.annotations.Test;

import java.util.function.Predicate;

public class Test01 {
    @Test
    public void pre() {
        System.out.println(validate("ABCDEFabcdef123450"));
        System.out.println(validate("SQL"));
        System.out.println(validate("Java"));
        System.out.println(validate("*&%@#!}{"));
        System.out.println(validate("w3resource.com"));
    }

    private boolean validate(String s1) {
        return s1.matches("[a-zA-Z]+$");
    }
}