package structuralpatterns.tarinings.javaedupl.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Catalog {
    private Map<String, Item123> items = new HashMap<>();

    public Item123 lookup(String itemName) {
        if (!items.containsKey(itemName)) {
            items.put(itemName, new Item123(itemName));
        }
        return items.get(itemName);
    }

    public int totalItemsMade() {
        return items.size();
    }
}