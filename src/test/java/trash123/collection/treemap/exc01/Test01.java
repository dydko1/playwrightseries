package trash123.collection.treemap.exc01;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Test01 {
    @Test
    public void exc3() {
        // Create a tree map
        TreeMap<Integer,String> tree_map=new TreeMap<Integer,String>();
        // Put elements to the map
        tree_map.put(1, "Red");
        tree_map.put(2, "Green");
        tree_map.put(3, "Black");
        tree_map.put(4, "White");
        tree_map.put(5, "Blue");

        for (Map.Entry<Integer,String> entry : tree_map.entrySet())
        {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }
    }
}