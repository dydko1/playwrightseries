package trash123.thread.others.exc003;

public class ThreadJoining extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(500);
                System.out.println("Current Thread xxxx: "
                        + Thread.currentThread().getName());

            } catch (Exception ex) {
                System.out.println("Exception has" +
                        " been caught" + ex);
            }
            System.out.println(i);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        ThreadJoining t1 = new ThreadJoining();
        t1.setName("Watek 01");
        ThreadJoining t2 = new ThreadJoining();
        t2.setName("Watek 02");
        ThreadJoining t3 = new ThreadJoining();
        t3.setName("Watek 03");

        // thread t1 starts
        t3.start();

        // starts second thread after when
        // first thread t1 has died.

        System.out.println("Current Thread yyy1: "
                + Thread.currentThread().getName());
        t3.join();

        // t3 starts
        t1.start();


        System.out.println("Current Thread yyy3: "
                + Thread.currentThread().getName());
        t1.join();

        // t2 starts
        t2.start();

        // starts t3 after when thread t2 has died.

        System.out.println("Current Thread yyy2: "
                + Thread.currentThread().getName());
        t2.join();




    }
}