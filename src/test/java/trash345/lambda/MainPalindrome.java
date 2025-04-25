package trash345.lambda;

import java.util.function.Predicate;

public class MainPalindrome {

    public static void main(String[] args) {

        Predicate<String> isPalindrome = s -> s.contentEquals(new StringBuilder(s).reverse());

        System.out.println(isPalindrome.test("madam"));
        System.out.println(isPalindrome.test("anna1"));
    }
}
