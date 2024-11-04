package trash123.thread.others.exc001;

public class ThreadMethod4 extends Thread {

    public static void main(String[] args) {
        ThreadMethod4 threadMethod4 = new ThreadMethod4();
        threadMethod4.run();
    }

    @Override
    public void run() {
        System.out.println("run method called ");
        System.out.println("Current Thread running " + currentThread().getName());
    }
}