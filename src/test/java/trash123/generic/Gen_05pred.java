package trash123.generic;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Gen_05pred {
    @Test
    public void exc3() {

        Predicate<Integer> lesserthan = n -> n % 2 == 0;

        List < Integer > numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        System.out.println("Original list of numbers: " + numbers);
        // Filter even numbers
        List < Integer > evenNumbers = filterList(numbers, lesserthan);
        System.out.println("Even numbers: " + evenNumbers);

        // Filter odd numbers
        List < Integer > oddNumbers = filterList(numbers, n -> n % 2 != 0);
        System.out.println("Odd numbers: " + oddNumbers);

        List < String > colors = List.of("Red", "Green", "White", "Orange", "Black", "Pink");
        System.out.println("\nOriginal list of Colors: " + colors);
        // Filter colors starting with 'O'
        Predicate<String> s1= color -> color.startsWith("O");
        List < String > wordsStartingWithO = filterList(colors, color -> color.startsWith("O"));
        System.out.println("Colors starting with 'O': " + wordsStartingWithO);

        // Filter colors with length greater than 4
        List < String > wordsLengthGreaterThan4 = filterList(colors, color -> color.length() > 4);
        System.out.println("Colors with length greater than 4: " + wordsLengthGreaterThan4);

    }

    private <T> List<T> filterList(List<T> originalList, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();

        for (T element : originalList) {
            if (predicate.test(element)) {
                filteredList.add(element);
            }
        }

        return filteredList;
    }
}