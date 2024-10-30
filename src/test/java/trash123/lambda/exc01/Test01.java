package trash123.lambda.exc01;

import org.testng.annotations.Test;

public class Test01 {
    @Test
    public void sum() {
        SumCal sumCal = (x, y) -> x + y;

        System.out.println(sumCal.sum(20, 30));
    }

    @Test
    public void mult() {
        SumCal sumCal = (x, y) -> x * y;
        System.out.println(sumCal.sum(50,60));
    }
}