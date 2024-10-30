package trash123.datetime.exc22;

import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Test22 {
    @Test
    public void exc5() {
        LocalDate today = LocalDate.now();
        System.out.println("\nCurrent Date: " + today);
        System.out.println("10 days before today will be " + today.plusDays(-10));
        System.out.println("10 days after today will be " + today.plusDays(10) + "\n");
    }
}