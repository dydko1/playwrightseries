package trash123.datetime.exc12;

import org.testng.annotations.Test;

import java.text.DateFormatSymbols;
import java.util.Locale;

public class Test12 {
    @Test
    public void exc5() {

        DateFormatSymbols symbols = new DateFormatSymbols(new Locale("fr"));

        String[] dayName = symbols.getWeekdays();
        for(String s:dayName)
            System.out.println(s);
    }
}