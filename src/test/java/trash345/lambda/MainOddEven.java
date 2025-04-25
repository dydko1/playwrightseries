package trash345.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainOddEven {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(11, 23, 98, 34, 15, 32, 42, 80, 99, 100);

        Integer oddSum = nums.stream().filter(s -> s % 2 != 0).mapToInt(n -> n * n).sum();
        System.out.println(oddSum);

        List<Integer> evenSum = nums.stream().filter(n -> n % 2 == 0).toList().stream().mapToInt(n -> n * n).boxed().collect(Collectors.toList());
        System.out.println(evenSum);
    }
}
