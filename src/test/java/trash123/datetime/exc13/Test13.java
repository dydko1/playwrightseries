package trash123.datetime.exc13;

import org.testng.annotations.Test;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;

public class Test13 {
    @Test
    public void exc5() {
        Calendar cal = Calendar.getInstance();

        System.out.println("------------------");
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(dayOfWeek);
    }
}