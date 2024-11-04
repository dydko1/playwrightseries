package trash123.thread.others.exc001;

import java.util.SortedSet;

public class ThreadExample implements Runnable {
    public static void main(String[] args) {
        ThreadExample threadExample = new ThreadExample();
        Thread thread = new Thread(threadExample);
        thread.start();
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + "\tStarted");
    }
}