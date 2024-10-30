package trash123.regularexpression.g4g;

import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg02 {
    @Test
    public void pre() {

        String text = "Mary had a little lamb";

        Pattern pattern = Pattern.compile("\\b");
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.println("Found match at: "  + matcher.start() + " to " + matcher.end());
        }
    }
}