package trash123.datetime.exc19;

import org.testng.annotations.Test;

import java.text.DateFormatSymbols;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Calendar;
import java.util.Locale;

public class Test13 {
    @Test
    public void exc5() {
        LocalDate today = LocalDate.now();
        LocalDate userday = LocalDate.of(2015, Month.MAY, 15);
        Period diff = Period.between(userday, today);
        System.out.println("\nDifference between "+ userday +" and "+ today +": "
                + diff.getYears() +" Year(s) and "+ diff.getMonths() +" Month()s\n"
        +"days: "+diff.getDays());
    }
}