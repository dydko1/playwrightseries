package trash123.thread.exc02.thread.trash1;

public class MyRun1 implements Runnable {

    private int id;

    public MyRun1(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        while (id < 1000) {
            System.out.println("Wątek: " + id);
            try {
                Thread.sleep(100);
                id++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}