package trash123.sets;

import java.io.*;
import java.util.*;

// Main class
// AddingElementsToLinkedHashSet
class GFG {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating an empty LinkedHashSet
        LinkedHashSet<String> hs = new LinkedHashSet<String>();

        // Adding elements to above Set
        // using add() method

        // Note: Insertion order is maintained
        hs.add("Geek");
        hs.add("For");
        hs.add("Geeks");

        // Printing elements of Set
        System.out.println("LinkedHashSet : " + hs);
    }
}