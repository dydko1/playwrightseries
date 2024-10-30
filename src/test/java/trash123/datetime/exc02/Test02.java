package trash123.datetime.exc02;

import org.testng.annotations.Test;

import java.util.Calendar;

public class Test02 {
    @Test
    public void exc3() {

        Calendar cal = Calendar.getInstance();
        // Sets the given calendar field value and the time value
        // (millisecond offset from the Epoch) of this Calendar undefined.
                System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.DATE));
        System.out.println();
    }
}