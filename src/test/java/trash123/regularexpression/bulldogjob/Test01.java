package trash123.regularexpression.bulldogjob;

import org.testng.annotations.Test;

public class Test01 {
    @Test
    public void pre() {
        System.out.println(validate("ABCDEFabcdef123450fsdsdfs"));
        System.out.println(validate("SQK   "));
        System.out.println(validate("Java"));
        System.out.println(validate("*&%@#!}{"));
        System.out.println(validate("w3resource.com"));
        System.out.println(validate("abc abc abc"));
        System.out.println(validate("abc abccccc abcccccc"));
    }

    private boolean validate(String s1) {
        return s1.matches("\\w+\\d+\\w+.\\w+");
        //return s1.matches("SQ\\w?\\s{2,4}");
    }
}