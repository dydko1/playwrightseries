package trash123.thread.exc02.thread.samouczekprogramisty.exa1;

public class Main01 {
    public static void main(String[] args) {
        System.out.println("MT start");
        Thread thread = new Thread(() -> {
            System.out.println("T0 start");
            for (int i = 0; i < 5; i++) {
                System.out.println("T0 -> " + i);
            }
        });

        thread.start();
//        for (int i = 0; i < 5; i++) {
//            System.out.println("MT!!! " + i);
//        }
        System.out.println("MT stop");
    }
}