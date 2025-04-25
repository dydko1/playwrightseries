package trash345.staticmember;

public class Initializer {

    static int initVal;

    static {
        initVal = 1111;
        System.out.println("Static block: initVal = " + initVal);
    }

    public static void main(String[] args) {
        System.out.println("initVal = " + initVal);
        Initializer initializer = new Initializer();
        initVal = 2222;
        System.out.println("After creating an instance: initialValue = " + Initializer.initVal);
    }
}
