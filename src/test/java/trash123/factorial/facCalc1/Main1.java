package trash123.factorial.facCalc1;

public class Main1 {
    public static void main(String[] args) {

        System.out.println(fact(5));
    }

    private static int fact(int i) {
        if (i == 1)
            return 1;
        return i * fact(i - 1);
    }
}