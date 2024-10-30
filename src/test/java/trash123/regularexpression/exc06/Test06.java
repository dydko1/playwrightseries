package trash123.regularexpression.exc06;

import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test06 {
    @Test
    public void pre() {
        System.out.println(validate("The quick brown fox jumps over the lazy dog."));
        System.out.println(validate("Java Exercises."));
        System.out.println(validate("Do humans eat gizzards?"));
        System.out.println(validate("gizzards?"));
    }

    private String validate(String s1) {

//        Pattern pattern = Pattern.compile("\\w*g.\\w*");
        Pattern pattern = Pattern.compile("\\w*g.\\w*");
        Matcher m = pattern.matcher(s1);

        if (m.find())
            return "Found a match!";
        else
            return "Not matched!";
    }
}