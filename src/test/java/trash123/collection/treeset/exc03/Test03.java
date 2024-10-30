package trash123.collection.treeset.exc03;

import org.testng.annotations.Test;

import java.util.TreeSet;

public class Test03 {
    @Test
    public void exc3() {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Orange");
        treeSet.add("White");
        treeSet.add("Black");

        TreeSet<String> tree_set2 = new TreeSet<String>();
        tree_set2.add("Pink");
        tree_set2.add("White11");
        tree_set2.add("Black");

        treeSet.addAll(tree_set2);

        System.out.println(treeSet);
    }
}