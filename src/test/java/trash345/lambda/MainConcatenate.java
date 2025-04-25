package trash345.lambda;

import java.util.function.BiFunction;

public class MainConcatenate {

    public static void main(String[] args) {
        BiFunction<String, String, String> concatenate = (s1, s2) -> String.format( "%1$s%2$s", s1, s2);
        System.out.println(concatenate.apply("aaa", "bbb"));
    }
}
