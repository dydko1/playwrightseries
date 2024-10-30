package trash123.lambda.exc14;

import org.testng.annotations.Test;
import trash123.lambda.exc13.WordCounter;

import java.util.function.Predicate;

public class Test14 {
    @Test
    public void minMax() {

        Predicate<String> isPalindrome = s -> {
            String rev = new StringBuffer(s).reverse().toString();
            return s.equals(rev);
        };

        System.out.println(isPalindrome.test("madam"));
        System.out.println(isPalindrome.test("anna1"));
    }
}