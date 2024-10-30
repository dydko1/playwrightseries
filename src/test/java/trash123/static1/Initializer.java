package trash123.static1;

public class Initializer {

    static int initVal;

    static {
        initVal = 4000;
        System.out.println("initVal=" + initVal);
    }
}