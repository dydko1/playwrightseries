package trash345.statement;

import org.testng.annotations.Test;

public class Multiplication {

    @Test
    public void display() {

        Integer n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(j);
            }

            for (int j = 0; j < i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }        //int i, j;
    }
}
