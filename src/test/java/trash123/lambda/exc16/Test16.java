package trash123.lambda.exc16;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test16 {
    @Test
    public void searchWord() {
        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Orange", "Black");

        int max_Length=colors
                .stream()
                .mapToInt(String::length)
                .max()
                .orElse(0);
        System.out.println(max_Length);
    }
}