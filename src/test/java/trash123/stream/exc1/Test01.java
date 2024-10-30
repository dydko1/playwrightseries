package trash123.stream.exc1;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Test01 {
    @Test
    public void average() {
        List<Integer> nums = Arrays.asList(1, 3, 6, 8, 10, 18, 36);

        System.out.println(nums.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.));
    }

}