package trash123.datetime.exc06;

import org.testng.annotations.Test;

import java.util.Calendar;
import java.util.TimeZone;

public class Test06 {
    @Test
    public void exc5() {

        Calendar now = Calendar.getInstance();
        System.out.println("Month: " + now.get(Calendar.MONTH + 1));
        System.out.println("Milsec: "+now.get(Calendar.MILLISECOND));

        System.out.println(now);
    }
}