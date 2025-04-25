package trash345.lambda;

import java.util.function.Predicate;

public class MainPrime {
    public static void main(String[] args) {

        Predicate<Integer> isPrime = n -> {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        System.out.println(isPrime.test(11));;
    }
}
