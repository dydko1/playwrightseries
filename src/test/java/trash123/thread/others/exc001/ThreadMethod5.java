package trash123.thread.others.exc001;

public class ThreadMethod5 extends Thread {
    @Override
    public void run() {
        System.out.println("run method called ");
        System.out.println("Current Thread running " + currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadMethod5 threadMethod5 = new ThreadMethod5();
        threadMethod5.start();
    }
}