package trash123.lambda.exc11;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test11 {
    @Test
    public void minMax() {
        List<Integer> nums = Arrays.asList(12, 15, 0, 8, 7, 9, -6);

        Optional<Integer> min = nums.stream().min((o1, o2) -> o1.compareTo(o2));
        Optional<Integer> max = nums.stream().max(((o1, o2) -> o1.compareTo(o2)));

        System.out.println(min + "\t" + max);
    }
}