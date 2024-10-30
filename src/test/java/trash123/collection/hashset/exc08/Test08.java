package trash123.collection.hashset.exc08;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test08 {
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

        Set<String> treeSet=new TreeSet<>(h_set);
        System.out.println(treeSet);
    }
}