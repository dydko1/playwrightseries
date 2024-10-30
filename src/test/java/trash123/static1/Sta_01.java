package trash123.static1;

import org.testng.annotations.Test;

public class Sta_01 {

    private static int count = 0;

    public Sta_01() {
        count++;
    }

    public static int getNumber() {
        return count;
    }
}