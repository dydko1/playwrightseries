package trash123.datetime.exc05;

import org.testng.annotations.Test;

import java.util.Calendar;
import java.util.TimeZone;

public class Test05 {
    @Test
    public void exc5() {

        Calendar calNewYork = Calendar.getInstance();
        //calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        calNewYork.setTimeZone(TimeZone.getTimeZone("Asia/Tbilisi"));
        System.out.println();
        System.out.println("Time in New York: " + calNewYork.get(Calendar.HOUR_OF_DAY) + ":"
                + calNewYork.get(Calendar.MINUTE) + ":" + calNewYork.get(Calendar.SECOND)
                + ":\nday="
                + calNewYork.get(Calendar.DAY_OF_MONTH));
        System.out.println();
    }
}