package trash123.datetime.exc08;

import org.testng.annotations.Test;

import java.util.Calendar;

public class Test08 {
    @Test
    public void exc5() {

        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));

        System.out.println(cal.getTime());
    }
}