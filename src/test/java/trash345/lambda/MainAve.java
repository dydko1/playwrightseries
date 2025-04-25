package trash345.lambda;

import java.util.Arrays;
import java.util.List;

public class MainAve {
    public static void main(String[] args) {

        List<Double> nums = Arrays.asList(3.5, 7.5, 4.3, 4.7, 5.1);

        Double average = nums.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println("Average: " + average);
    }
}
