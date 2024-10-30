package trash123.collection.hashset.exc07;

import org.testng.annotations.Test;

import java.util.HashSet;

public class Test07 {
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
        String[] str = new String[h_set.size()];
        h_set.toArray(str);
        for (String s : str) {
            System.out.println(s);

        }
    }
}