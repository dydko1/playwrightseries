package trash345.lambda;

import java.util.function.LongUnaryOperator;

public class MainFact {

    public static void main(String[] args) {
        LongUnaryOperator f = n -> {
            long result = 1;
            for (long i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println(f.applyAsLong(5));
    }
}
