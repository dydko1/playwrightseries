package trash123.generic;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gen_02 {
    @Test
    public void exc3() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 5));
        List<Double> list2 = new ArrayList<>(Arrays.asList(1.2, 3.5, 4., 9., 9.8));

        sumEvenOdd(list1);
        sumEvenOdd(list2);
    }

    private <T extends Number> void sumEvenOdd(List<T> numbers) {
        Double sumOdd = 0.;
        Double sumEven = 0.;

        for (T d : numbers) {
            if (d.doubleValue() % 2 == 0)
                sumEven += d.doubleValue();
            else
                sumOdd += d.doubleValue();
        }

        System.out.println("Even= " + sumEven);
        System.out.println("Odd= " + sumOdd);
    }
}