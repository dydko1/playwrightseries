package trash123.thread.others.exc002.a1;

import java.util.SortedSet;

public class ThreadMethods02 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread started");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Child thread executing");
                sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}