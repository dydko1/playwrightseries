package trash123.collection.linkedlist.exc05;

import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.LinkedList;

public class Test05 {
    @Test
    public void exc4() {
// create an empty linked list
        LinkedList <String> l_list = new LinkedList <String> ();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        System.out.println("Original linked list: ");
        System.out.println("Let add the Yellow color after the Red Color: " + l_list);
        l_list.add(1, "aaaaYellow");
        // print the list
        System.out.println("The linked list:" + l_list);
    }
}