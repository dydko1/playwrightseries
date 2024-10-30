package trash123.lambda.exc18;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class Test18 {
    @Test
    public void searchWord() {
        Integer[] nums = {
                1,
                19,15,16,
                20,
                18,
                25,
                77,
                300,
                101
        };

        Integer i=Arrays.stream(nums).distinct()
                .sorted(Comparator.naturalOrder())
                .skip(2)
                .findFirst()
                .orElse(null);
        System.out.println(i);
    }
}