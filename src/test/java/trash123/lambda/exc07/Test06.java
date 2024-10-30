package trash123.lambda.exc07;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test06 {
    @Test
    public void conUpper() {
        List<Integer> nums = Arrays.asList(1, 2, 1, 3, 3, 4, 3, 2, 5, 6, 1, 7, 7, 8, 10);
        List<Integer> unique_nums = new ArrayList<>();

        nums.stream().distinct().forEach(unique_nums::add);
        //nums.stream().distinct().collect(Collectors.toList());
        System.out.println(unique_nums);

    }
}