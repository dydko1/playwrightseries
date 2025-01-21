package trash123.privateconstructor.complex;

final class ComplexNumber {

    private float realNumber;
    private float imaginaryNumber;

    public static ComplexNumber zero() {
        return new ComplexNumber(0, 0);
    }

    public ComplexNumber(float realNumber, float imaginaryNumber) {
        this.realNumber = realNumber;
        this.imaginaryNumber = imaginaryNumber;
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(
                realNumber + other.realNumber,
                imaginaryNumber + other.imaginaryNumber);
    }

    public String toString() {
        return String.format("%f + %f i", realNumber, imaginaryNumber);
    }
}