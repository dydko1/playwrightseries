package trash123.collection.treemap.exc07;

import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.TreeMap;

public class Test07 {
    @Test
    public void exc3() {
        Comparator<String> comparator = (s1, s2) -> {
            return s2.compareTo(s1);
        };
        TreeMap<String, String> tree_map1 = new TreeMap<String, String>(comparator);
        // Put elements to the map
        tree_map1.put("C2", "Red");
        tree_map1.put("C4", "Green");
        tree_map1.put("C3", "Black");
        tree_map1.put("C1", "White");
        System.out.println(tree_map1);
    }
}