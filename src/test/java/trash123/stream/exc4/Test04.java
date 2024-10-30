package trash123.stream.exc4;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test04 {
    @Test
    public void average() {
        List<String> colors = Arrays.asList("Red", "Bal", "Green", "Blue", "Pink", "Brown", "B");

        String search = "Ba";
        Predicate<String> ssss = s -> s.startsWith("B");

        long nu = colors.stream()
                .filter(ssss)
                .count();
        System.out.println(nu);
    }
}