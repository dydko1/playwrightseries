package trash123.lambda.exc06;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Test06 {
    @Test
    public void conUpper() {
        List<Integer> numbers = Arrays.asList(1,2,3);

        Double d=numbers.stream().mapToDouble(Integer::doubleValue)
                .average().orElse(0.0);

        System.out.println(d);
    }
}