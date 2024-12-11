package trash123.listlistsjava.a1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListOfListExample1 {
    public static void main(String[] args) {
// creating different lists
        List<String> empNames = new ArrayList<>();
        List<Integer> empAges = new ArrayList<>();
        List<String> designation = new ArrayList<>();
// adding elements to lists
        empNames.add("Joseph");
        empNames.add("Mike");
        empNames.add("John");
        empAges.add(25);
        empAges.add(24);
        empAges.add(27);
        designation.add("Author");
        designation.add("Team Lead");
        designation.add("Manager");
// Creating a List of Lists from the given lists
        List<List<? extends Object>> exampleLists = Stream.of(empNames, empAges, designation).collect(Collectors.toList());
        System.out.println("The Created List of Lists: " + exampleLists.get(0).get(1));
    }
}