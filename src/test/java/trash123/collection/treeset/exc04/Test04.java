package trash123.collection.treeset.exc04;

import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.TreeSet;

public class Test04 {
    @Test
    public void exc3() {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Orange");
        treeSet.add("White");
        treeSet.add("Black");

        Iterator<String> it= treeSet.descendingIterator();

        while (it.hasNext())
            System.out.println(it.next());

        System.out.println(treeSet);
    }
}