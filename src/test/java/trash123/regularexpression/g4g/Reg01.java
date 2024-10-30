package trash123.regularexpression.g4g;

import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg01 {
    @Test
    public void pre() {

        String text    =
                "This is the text to be searched " +
                        "for occurrences of the http:// pattern.";

        String regex = ".*http://.*";

        boolean matches = Pattern.matches(regex, text);

        System.out.println("matches = " + matches);
    }
}