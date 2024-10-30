package trash123.lambda.exc08;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.LongUnaryOperator;

public class Test08 {
    @Test
    public void conUpper() {

        LongUnaryOperator f = n -> {
            long r = 1;
            for (long i = 1; i <= n; i++) {
                r *= i;
            }
            return r;
        };
        long n = 7;
        long fac2 = f.applyAsLong(5l);
        System.out.println(fac2);
    }
}