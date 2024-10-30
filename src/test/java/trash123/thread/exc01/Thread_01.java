package trash123.thread.exc01;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Thread_01 extends Thread {
    @Test
    public void runThread() {
        Thread_01 thread_01 = new Thread_01();
        thread_01.run();
    }

    @Override
    public void run() {
        System.out.println("Hello World!!!");
    }
}