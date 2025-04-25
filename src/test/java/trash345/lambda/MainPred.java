package trash345.lambda;

import java.util.function.Predicate;

public class MainPred {
    public static void main(String[] args) {

        Predicate<String> isEmptyString = String::isEmpty;
        String s1 = "";
        String s2 = "sdjfklsdksk";
        System.out.println(isEmptyString.test(s1));
        System.out.println(isEmptyString.test(s2));
    }
}
