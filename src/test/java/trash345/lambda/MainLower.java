package trash345.lambda;

import java.util.Arrays;
import java.util.List;

public class MainLower {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Red", "Green", "Blue", "PINK");

        for (String s : stringList) {
            System.out.println(s);
        }

        stringList.replaceAll(String::toLowerCase);
        System.out.println("----------------");
        for (String s : stringList) {
            System.out.println(s);
        }
    }
}
