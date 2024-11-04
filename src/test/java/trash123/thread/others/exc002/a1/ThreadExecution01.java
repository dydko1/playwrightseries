package trash123.thread.others.exc002.a1;

import static java.lang.Thread.sleep;

public class ThreadExecution01 {
    public static void main(String[] args) throws InterruptedException {
        ThreadMethod7 threadMethod7 = new ThreadMethod7();
        threadMethod7.start();
        while (!threadMethod7.isInterrupted()) {
            System.out.println("not interrupted ");
            sleep(2000);
            //Main thread interrupting child thread
            threadMethod7.interrupt();
        }
        System.out.println("Main thread execution completed");
    }
}