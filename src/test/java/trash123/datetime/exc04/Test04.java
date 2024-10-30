package trash123.datetime.exc04;

import org.testng.annotations.Test;

import java.util.Calendar;

public class Test04 {
    @Test
    public void exc3() {

        Calendar now = Calendar.getInstance();
        System.out.println();
        System.out.println("Current full date and time is : " + (now.get(Calendar.MONTH) + 1) + "-"
                + now.get(Calendar.DATE) + "-" + now.get(Calendar.YEAR) + " "
                + now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE) + ":"
                + now.get(Calendar.SECOND) + "." + now.get(Calendar.MILLISECOND));
        System.out.println();
    }
}