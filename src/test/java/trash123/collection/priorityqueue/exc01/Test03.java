package trash123.collection.priorityqueue.exc01;

import org.testng.annotations.Test;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class Test03 {
    @Test
    public void exc3() {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Red");
        queue.add("Green");
        queue.add("Orange");
        queue.add("White");
        queue.add("aBlack");
        System.out.println("Elements of the Priority Queue: ");
        System.out.println(queue);
    }
}