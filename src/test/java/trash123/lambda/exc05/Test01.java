package trash123.lambda.exc05;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test01 {
    @Test
    public void conUpper() {
        List<String> colors = Arrays.asList("red", "green", "blue", "aaa", "black", "pink");

        colors.sort((o1, o2) -> o1.compareTo(o2));

        System.out.println(colors);
    }
}