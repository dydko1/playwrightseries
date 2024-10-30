package trash123.datetime.exc09;

import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test09 {
    @Test
    public void exc5() {
        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONTH);

        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");

        System.out.println(df.format(cal.getTime()));

//        for(int i=0;i<6;i++){
//            cal.add(Calendar.DATE,1);
//        }
        cal.add(Calendar.DATE,2);
        System.out.println(df.format(cal.getTime()));

    }
}