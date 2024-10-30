package trash123.thread.exc02.thread.samouczekprogramisty.exa2;

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable r = () -> {
            for (int i = 0; i < 100_000; i++) {
                c.increment();
                //System.out.println(i);
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Val=" + c.getValue());
    }
}