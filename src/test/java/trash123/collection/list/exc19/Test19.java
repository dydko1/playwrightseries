package trash123.collection.list.exc19;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class Test19 {
    @Test
    public void rev10() {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original array list: " + c1);
        System.out.println("Let trim to size the above array: ");
        c1.trimToSize();
        c1.add("ddddddddddddd");
        System.out.println(c1);
    }
}