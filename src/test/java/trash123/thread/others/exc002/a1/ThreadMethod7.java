package trash123.thread.others.exc002.a1;

public class ThreadMethod7 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread started:");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Child thread executing");
                sleep(1000);
            }
            System.out.println("Thread executed");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}