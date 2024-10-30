package trash123.datetime.exc24;

import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test24 {
    @Test
    public void exc5() {
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date.format(DateTimeFormatter.ofPattern("d::MM::uuu HH::mm:ss")));
    }
}