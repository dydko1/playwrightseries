package trash123.thread.others.exc003;

public class ThreadMethods003 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("current thread  " + currentThread().getName());
            Thread.yield();
        }
        System.out.println("Thread executed");
    }

}