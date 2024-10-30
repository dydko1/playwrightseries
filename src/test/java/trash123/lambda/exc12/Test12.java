package trash123.lambda.exc12;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test12 {
    @Test
    public void minMax() {
        List<Integer> nums = Arrays.asList(1,5,2,50);

        int res = nums.stream()
                .reduce(1, (x, y) -> x * y);
        System.out.println(res);
    }
}