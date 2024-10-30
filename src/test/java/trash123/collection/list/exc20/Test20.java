package trash123.collection.list.exc20;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class Test20 {
    @Test
    public void rev10() {
        ArrayList<String> c1 = new ArrayList<String>(3);
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        System.out.println("Original array list: " + c1);
        //Increase capacity to 6
        c1.ensureCapacity(2000);
        c1.add("White");
        c1.add("Pink");
        c1.add("Yellow");
        System.out.println("New array list: " + c1 + "\n" + c1.size());
        for (String s : c1
        ) {
            System.out.println(s + "fff");

        }
    }
}