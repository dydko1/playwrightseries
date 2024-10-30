package trash123.collection.hashset.exc10;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Test10 {
    @Test
    public void exc3() {
        HashSet<String> h_set = new HashSet<String>();
        // use add() method to add values in the hash set
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");

        HashSet<String> h_set2 = new HashSet<String>();
        h_set2.add("Red");
        h_set2.add("Pink");
        h_set2.add("Black");
        h_set2.add("Orange");
        //comparison output in hash set
        HashSet<String> result_set = new HashSet<String>();

        for (String s : h_set) {
            System.out.println(h_set2.contains(s) ? "YES" : "NO");

        }
    }
}