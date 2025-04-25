package trash345.lambda;

public class MainSum {

    public static void main(String[] args) {

        SumCalculator s = (x, y) -> x + y;
        System.out.println(s.sum(10, 20));
        s = (x, y) -> x * y;
        System.out.println(s.sum(50, 50));
    }
}
