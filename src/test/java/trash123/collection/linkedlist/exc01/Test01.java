package trash123.collection.linkedlist.exc01;

import org.testng.annotations.Test;

import java.util.LinkedList;

public class Test01 {
    @Test
    public void exc3() {
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        l_list.add("Yellow");

        // print the list
        System.out.println("The linked list: " + l_list);
    }
}