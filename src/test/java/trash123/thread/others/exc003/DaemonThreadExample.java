package trash123.thread.others.exc003;

public class DaemonThreadExample extends Thread {
    String s;

    public DaemonThreadExample(String name) {
        s = name;
    }

    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println(s + " is Daemon Thread");
        } else {
            System.out.println(s + " is User Thread");
        }
    }

    public static void main(String[] args) {

        DaemonThreadExample thread1 = new DaemonThreadExample("thread1");
        DaemonThreadExample thread2 = new DaemonThreadExample("thread2");
        DaemonThreadExample thread3 = new DaemonThreadExample("thread3");

        thread1.setDaemon(true);
        thread1.start();
        thread2.start();
        thread3.setDaemon(true);
        thread3.start();
    }
}