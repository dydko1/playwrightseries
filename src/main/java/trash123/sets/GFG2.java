package trash123.sets;

import java.util.HashSet;
import java.util.Iterator;

public class GFG2 {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<>();

        // Adding elements into HashSet
        // using add() method
        h.add("India");
        h.add("Australia");
        h.add("South Africa");

        // Adding duplicate elements
        h.add("India");

        // Displaying the HashSet
        System.out.println(h);
        System.out.println("List contains India or not:"
                + h.contains("India"));

        Iterator<String> i = h.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}