package trash123.thread.others.exc001;

public class ThreadMethod3 extends Thread {
    public static void main(String[] args) {
        System.out.println("Current thread's old name: " + currentThread().getName());
        currentThread().setName("Miro");
        System.out.println("Current thread's new name: " + currentThread().getName());
    }
}