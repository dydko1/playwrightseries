package trash123.collection.list.exc17;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class Test17 {
    @Test
    public void rev10() {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original array list: " + c1);
        c1.removeAll(c1);
        System.out.println("Array list after remove all elements " + c1);
        System.out.println("size:" + c1.size());
    }
}