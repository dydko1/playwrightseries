package trash123.thread.others.exc001;

public class ThreadMethodPrio extends Thread {
    public static void main(String[] args) {
        System.out.println("Current thread's old priority: " + currentThread().getPriority());
        currentThread().setPriority(2);
        System.out.println("Current thread's new priority: " + currentThread().getPriority());
    }
}