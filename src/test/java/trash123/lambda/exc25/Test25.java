package trash123.lambda.exc25;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Test25 {
    @Test
    public void searchWord() {
        int n = 33;
        System.out.println("Number: " + n);

        Function<Integer, String> convertToBinary = num -> Integer.toBinaryString(num);
        String binaryRepresentation = convertToBinary.apply(n);
        System.out.println("Binary representation: " + binaryRepresentation);
        n = 747;
        System.out.println("\nNumber: " + n);
        convertToBinary = num -> Integer.toBinaryString(num);
        binaryRepresentation = convertToBinary.apply(n);
                System.out.println("Binary representation: " + binaryRepresentation);
        System.out.println("-------------");
        System.out.println(convertToBinary.apply(3));
    }
}