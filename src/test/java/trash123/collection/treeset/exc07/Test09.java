package trash123.collection.treeset.exc07;

import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.TreeSet;

public class Test09 {
    @Test
    public void exc3() {
        TreeSet<Integer> tree_num = new TreeSet<Integer>();
        TreeSet<Integer> treeheadset = new TreeSet<Integer>();

        // Add numbers in the tree
        tree_num.add(1);
        tree_num.add(20);
        tree_num.add(3);
        tree_num.add(5);
        tree_num.add(6);
        tree_num.add(7);
        tree_num.add(8);
        tree_num.add(9);
        tree_num.add(4);

        // Find numbers less than 7
        treeheadset = (TreeSet) tree_num.headSet(7);

        // create an iterator
        Iterator iterator;
        iterator = treeheadset.iterator();

        //Displaying the tree set data
        System.out.println("Tree set data: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }
}