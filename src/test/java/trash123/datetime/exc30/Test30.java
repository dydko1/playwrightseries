package trash123.datetime.exc30;

import org.testng.annotations.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Test30 {
    @Test
    public void exc5() {
        LocalDateTime dateTime = LocalDateTime.of(2016, 9, 16, 0, 0);
        LocalDateTime dateTime2 = LocalDateTime.now();
        int diffInNano = Duration.between(dateTime, dateTime2).getNano();
        long diffInSeconds = Duration.between(dateTime, dateTime2).getSeconds();
        long diffInMilli = Duration.between(dateTime, dateTime2).toMillis();
        long diffInMinutes = Duration.between(dateTime, dateTime2).toMinutes();
        long diffInHours = Duration.between(dateTime, dateTime2).toHours();
        long diffInDays = Duration.between(dateTime, dateTime2).toDays();
        System.out.printf("\nDifference is %d Hours, %d Minutes, %d Milli, %d Seconds and %d Nano\n\n",
                diffInHours, diffInMinutes, diffInMilli, diffInSeconds, diffInNano );
        System.out.println(diffInDays);

    }
}