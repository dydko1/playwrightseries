package trash345.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainEven {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(11, 23, 98, 34, 15, 32, 42, 80, 99, 100);
        System.out.println(nums);
        List<Integer> num2 = nums.stream().filter(s -> s % 2 == 0).toList();
        System.out.println("-----------" );

    }
}
