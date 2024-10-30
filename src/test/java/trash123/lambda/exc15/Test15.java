package trash123.lambda.exc15;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test15 {
    @Test
    public void sumOdd() {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = list.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(n->n*n)
                .sum();
        System.out.println(sum);


    }
}