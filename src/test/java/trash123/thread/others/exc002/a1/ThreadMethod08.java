package trash123.thread.others.exc002.a1;

import static java.lang.Thread.sleep;

public class ThreadMethod08 {
    public static void main(String[] args) throws InterruptedException {
        ThreadMethods02 threadMethods02=new ThreadMethods02();
        threadMethods02.start();
        while (threadMethods02.isAlive()) {
            System.out.println("Thread is alive - " + threadMethods02.isAlive());
            sleep(2000);
        }
        System.out.println("Thread terminated- " + threadMethods02.isAlive());
    }
}