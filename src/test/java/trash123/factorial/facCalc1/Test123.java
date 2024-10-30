package trash123.factorial.facCalc1;

import org.testng.annotations.Test;

public class Test123 {

    @Test
    public void rec() {
        System.out.println(rec1(5));
    }

    int rec1(int i) {
        if (i == 1)
            return 1;
        return i * rec1(i - 1);
    }
}