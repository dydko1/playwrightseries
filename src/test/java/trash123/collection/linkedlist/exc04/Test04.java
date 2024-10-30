package trash123.collection.linkedlist.exc04;

import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.LinkedList;

public class Test04 {
    @Test
    public void exc4() {
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("aa");
        l_list.add("bb");
        l_list.add("ck");
        l_list.add("cc");
        l_list.add("Pink");
        l_list.add("Yellow");

        Iterator<String> s = l_list.descendingIterator();

        while (s.hasNext())
            System.out.println(s.next());
        System.out.println(l_list);
    }
}