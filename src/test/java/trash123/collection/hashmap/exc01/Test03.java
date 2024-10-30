package trash123.collection.hashmap.exc01;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test03 {
    @Test
    public void exc3() {
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");
        for (Map.Entry x : hash_map.entrySet()) {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}