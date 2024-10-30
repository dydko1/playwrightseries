package trash123.datetime.exc07;

import org.testng.annotations.Test;

import java.util.Calendar;

public class Test07 {
    @Test
    public void exc5() {

        Calendar now = Calendar.getInstance();
        System.out.println("Month: " + now.getActualMaximum(Calendar.DAY_OF_MONTH));

        System.out.println(now);
    }
}