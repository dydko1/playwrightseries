package trash123.thread.others.exc001;

public class ThreadMethods6 extends Thread {
    @Override
    public void run() {
        System.out.println(currentThread().getThreadGroup());
    }

    public static void main(String args[]) {
        ThreadMethods threadMethods = new ThreadMethods();
        threadMethods.start();
    }
}