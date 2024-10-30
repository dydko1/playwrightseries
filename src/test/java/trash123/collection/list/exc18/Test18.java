package trash123.collection.list.exc18;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class Test18 {
    @Test
    public void rev10() {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original array list: " + c1);
        System.out.println("Checking the above array list is empty or not! " + c1.isEmpty());
        c1.removeAll(c1);
        System.out.println("Array list after remove all elements " + c1);
        System.out.println("Checking the above array list is empty or not! " + c1.isEmpty());
        System.out.println("=========" + c1.size());
    }
}