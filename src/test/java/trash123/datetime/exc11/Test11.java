package trash123.datetime.exc11;

import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Test11 {
    @Test
    public void exc5() {

        DateFormatSymbols symbols = new DateFormatSymbols(new Locale("fr"));

        String[] dayName = symbols.getWeekdays();
        for(String s:dayName)
            System.out.println(s);
    }
}