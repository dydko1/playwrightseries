package trash345.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MainContain {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Orange", "Black");

        Predicate<String> predicate = word -> word.contains("Re");
        boolean result = colors.stream().anyMatch(predicate);
        System.out.println(result);
        predicate.test("Orange1");
        result = colors.stream().anyMatch(predicate);
        System.out.println(result);
    }
}
