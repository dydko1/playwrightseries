package trash123.collection.hashset.exc05;

import org.testng.annotations.Test;

import java.util.HashSet;

public class Test05 {
    @Test
    public void exc3() {
        // Create a empty hash set
        HashSet<String> h_set = new HashSet<String>();
        // use add() method to add values in the hash set
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");

        System.out.println(h_set);

        HashSet<String> new_h_set = new HashSet<>();
        new_h_set = (HashSet) h_set.clone();
        System.out.println(new_h_set);
    }
}