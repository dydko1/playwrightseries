package trash345.exception;

public class Exception_OddNumber {

    public static void main(String[] args) {

        int n = 18;
        tryNumber(n);
        n = 443;
        tryNumber(n);

    }

    private static void tryNumber(int n) {
        try {
            checkEvenNumber(n);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void checkEvenNumber(int n) {
        if (n % 2 != 0) {
            throw new IllegalArgumentException(n + " is odd");
        }
    }
}
