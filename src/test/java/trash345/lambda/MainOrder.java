package trash345.lambda;

import java.util.Arrays;
import java.util.List;

public class MainOrder {

    public static void main(String[] args) {
        List<String> colors = Arrays.asList("red", "green", "blue", "black", "pink");

        System.out.println(colors);

        colors.sort(String::compareToIgnoreCase);
        System.out.println(colors);
    }
}
