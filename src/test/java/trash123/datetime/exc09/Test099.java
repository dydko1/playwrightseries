package trash123.datetime.exc09;

import org.testng.annotations.Test;

import java.time.YearMonth;

public class Test099 {
    @Test
    public void exc5() {

        YearMonth ym = YearMonth.of(2023, 7);

        String firstDay = ym.atDay(2).getDayOfWeek().name();
        String lastDay = ym.atEndOfMonth().getDayOfWeek().name();

        System.out.println(firstDay);
        System.out.println(lastDay);
    }
}