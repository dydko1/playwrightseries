package trash123.collection.list.exc13;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Test13 {
    @Test
    public void rev10() {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink1");

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink1");
        c2.add("Pink3");
        c2.add("Pink4");
        c2.add("Pink5");
        c2.add("Pink6");
        c2.add("Pink7");


        //Storing the comparison output in ArrayList<String>
        ArrayList<String> c3 = new ArrayList<String>();
        for (String e : c1)
            c3.add(c2.contains(e) ? "Yes" : "No");
        System.out.println(c3);
    }
}