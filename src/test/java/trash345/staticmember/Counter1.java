package trash345.staticmember;

public class Counter1 {

    private static int count = 0;

    public Counter1() {
        System.out.println("Counter1 object created");
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter1 c1 = new Counter1();
        Counter1 c2 = new Counter1();
        Counter1 c3 = new Counter1();

        System.out.println("Total objects created: " + Counter1.getCount());
    }

}
