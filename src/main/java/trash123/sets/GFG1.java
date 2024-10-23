package trash123.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class GFG1 {
    public static void main(String[] args) {
        //Set<String> hs = new LinkedHashSet<>();
        Set<String> hs = new HashSet<>();

        hs.add("Geek");
        hs.add("For");
        hs.add("Geeks");
        hs.add("A");
        hs.add("B");
        hs.add("Z");

        // Iterating though the LinkedHashSet
        // using iterators
        Iterator itr = hs.iterator();

        while (itr.hasNext())
            System.out.print(itr.next() + ", ");

        // New line
        System.out.println();

        // Using enhanced for loop for iteration
        for (String s : hs)
            System.out.print(s + ", ");
        System.out.println();
    }
}