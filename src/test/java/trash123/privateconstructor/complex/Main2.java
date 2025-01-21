package trash123.privateconstructor.complex;

public class Main2 {
    public static void main(String[] args) {
        ComplexNumber zero = ComplexNumber.zero();
        ComplexNumber abc = new ComplexNumber(5, 50);

        System.out.println(abc);
        System.out.println(zero);
    }
}