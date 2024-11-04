package trash123.thread.others.exc003;

public class ThreadExecution {
    public static void main(String args[]) throws InterruptedException {
        ThreadMethods003 thread1 = new ThreadMethods003();
        ThreadMethods003 thread2 = new ThreadMethods003();
        thread1.start();
        // thread1.join(); // This will make next thread to wait until this thread completes its execution
        thread2.start();
    }
}