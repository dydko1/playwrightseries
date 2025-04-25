package trash345.lambda;

import java.util.function.Predicate;

public class PerfSquare {
    public static void main(String[] args) {

        Predicate<Integer> isPrefectSquare = n -> {
            int sqrt = (int) Math.sqrt(n);
            return sqrt * sqrt == n;
        };

        int N = 36;
        boolean result1 = isPrefectSquare.test(N);
        System.out.println(N + " is a perfect square? " + result1);

        N = 26;
        boolean result2 = isPrefectSquare.test(N);
        System.out.println(N + " is a perfect square? " + result2);

        N = 10000;
        boolean result3 = isPrefectSquare.test(N);
        System.out.println(N + " is a perfect square? " + result3);
    }
}
