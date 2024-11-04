package trash123.thread.others.exc002;

public class Find_Even_Odd_Number {

    private static final int MAX_NUMBER = 20;
    private static Object lock = new Object();
    private static boolean isEvenTurn = true;

    public static void main(String[] args) {
        Thread even = new Thread(() -> evenCheck());
        Thread odd = new Thread(() -> oddCheck());
        even.start();
        odd.start();
        System.out.println("Bye Bye !!!");
    }

    public static void evenCheck() {
        for (int i = 2; i < MAX_NUMBER; i += 2) {
            synchronized (lock) {
                while (!isEvenTurn) {
                    try {
                        System.out.println("Parzyste");
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Evan Number from evenThread: " + i);
                isEvenTurn = false;
                lock.notify();
            }
        }
    }

    public static void oddCheck() {
        for (int i = 1; i < MAX_NUMBER; i += 2) {
            synchronized (lock) {
                while (isEvenTurn) {
                    try {
                        System.out.println("Nieparzyste");
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Odd Number from oddThread: " + i);
                isEvenTurn = true;
                lock.notify();
            }
        }
    }
}