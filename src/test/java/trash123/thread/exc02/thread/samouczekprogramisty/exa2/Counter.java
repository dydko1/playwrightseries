package trash123.thread.exc02.thread.samouczekprogramisty.exa2;

public class Counter {

    private int value;

    public int getValue() {
        return value;
    }

    public synchronized void increment() {
        value++;
    }
}