package trash345.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainSecondNumber {
    public static void main(String[] args) {

        Integer[] nums = {
                1,
                7,
                18,
                25,
                77,
                300,
                101
        };

        List<Integer> integers = Arrays.asList(nums);

        Integer max = integers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println(max);
    }
}
