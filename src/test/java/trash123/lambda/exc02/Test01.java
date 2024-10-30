package trash123.lambda.exc02;

import org.testng.annotations.Test;

import java.util.Locale;
import java.util.function.Predicate;

public class Test01 {
    @Test
    public void pre() {
        Predicate<String> predicate = s -> s.isEmpty();

        String s1 = "";
        String s2 = "Ala";

        System.out.println(predicate.test(s1));
        System.out.println(predicate.test(s2));
    }
}