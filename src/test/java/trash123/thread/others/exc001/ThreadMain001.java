package trash123.thread.others.exc001;

public class ThreadMain001 {
    public static void main(String[] args) {
        System.out.println("MT start");
        Thread thread = new Thread(() -> someMethod());
        thread.start();

        System.out.println("MT11 start");
        for (int i = 0; i < 5; i++) {
            System.out.println("MT: " + i);
        }
        System.out.println("MT stop");
    }

    private static void someMethod() {
        System.out.println("T0 -> start");
        for (int i = 0; i < 5; i++) {
            System.out.println("T0: " + i);
        }
        System.out.println("T0- > stop");
    }

}