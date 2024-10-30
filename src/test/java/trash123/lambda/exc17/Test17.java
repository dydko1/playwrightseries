package trash123.lambda.exc17;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test17 {
    @Test
    public void searchWord() {
        Predicate<Integer> sq = s -> {
            int sqrt = (int) Math.sqrt(s);
            return sqrt * sqrt == s;
        };

        System.out.println(sq.test(100));
        System.out.println(sq.test(10));
    }
}