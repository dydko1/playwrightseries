package trash123.regularexpression.exc03;

import org.testng.annotations.Test;

public class Test03 {
    @Test
    public void pre() {
        System.out.println(validate("java_exercises"));
        System.out.println(validate("Java_exercises"));
        System.out.println(validate("java_Exercises"));
        System.out.println(validate("Java_Exercises"));
    }

    private String validate(String s1) {

        return s1.matches("^[a-zA-Z]+_[a-z]+$") ?
                "Found a match!" :
                "Not matched!";
    }
}