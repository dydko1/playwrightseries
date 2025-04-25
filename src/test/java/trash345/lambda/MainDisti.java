package trash345.lambda;

import org.testng.Assert;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainDisti {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 3, 4, 3, 2, 5, 6, 1, 7, 7, 8, 10);
        List<Integer> unique_nums = nums
                .stream()
                .distinct()
                .toList();
        System.out.println(nums);
        System.out.println(unique_nums);
        Assert.assertTrue(nums.size() != unique_nums.size());
    }
}