package trash123.thread.exc02.thread.samouczekprogramisty.exa1;

public class Main02 {

    public static void main(String[] args) {
        MyThread thread=new MyThread();
        thread.start();
        MyRunnable myRunnable=new MyRunnable();
        myRunnable.run();
        System.out.println("-----------------");
        Test12 test12=new Test12();
        Thread thread1=new Thread(test12);
        thread1.start();
    }
}