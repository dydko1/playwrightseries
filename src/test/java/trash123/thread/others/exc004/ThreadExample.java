package trash123.thread.others.exc004;

import static java.lang.Thread.sleep;

public class ThreadExample {
    public static void main(String args[]) throws InterruptedException {
        Message message = new Message("Sharing msg object");
        ThreadOne threadOne = new ThreadOne(message);
        ThreadTwo threadTwo = new ThreadTwo(message);
        threadOne.setName("Thread One");
        threadTwo.setName("Thread Two");
        threadOne.start();
        threadTwo.start();
        while(threadOne.isAlive()){
            sleep(5000);
            System.out.println(threadOne.getState());
            threadOne.resume();
        }
    }
}