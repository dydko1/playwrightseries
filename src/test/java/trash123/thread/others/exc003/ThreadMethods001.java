package trash123.thread.others.exc003;

public class ThreadMethods001 extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("current thread  " + currentThread().getName());
                sleep(1000);
            }
            System.out.println("Thread executed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadMethods001 thread1 = new ThreadMethods001();
        ThreadMethods001 thread2 = new ThreadMethods001();
        thread1.start();
        thread1.join(); // This will make next thread to wait until this thread completes its execution
        thread2.start();
    }
}