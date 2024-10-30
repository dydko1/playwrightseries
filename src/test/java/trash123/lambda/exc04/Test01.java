package trash123.lambda.exc04;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test01 {
    @Test
    public void conUpper() {
        List<Integer> nums = Arrays.asList(11, 23, 98, 34, 15, 32, 42, 80, 99, 100);

        List<Integer> odd = nums.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
        System.out.println(odd);
    }
}