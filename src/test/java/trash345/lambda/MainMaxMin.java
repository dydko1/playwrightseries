package trash345.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MainMaxMin {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 3, 4, 3, 22, 5, 6, 1, 7, 7, 8, 10);

        Integer max = nums.stream().max(Integer::compareTo).orElse(0);
        System.out.println("Max: " + max);

        Integer min = nums.stream().max(Integer::compareTo).orElse(0);
        System.out.println("Max: " + min);

    }
}
