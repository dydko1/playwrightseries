package trash123.datetime.exc21;

import org.testng.annotations.Test;

import java.time.*;

public class Test21 {
    @Test
    public void exc5() {
        ZoneId.SHORT_IDS.keySet().
                stream().forEach(
                        zoneKey -> System.out.println(" " + ZoneId.of(ZoneId.SHORT_IDS.get(zoneKey)) + ": " + LocalDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get(zoneKey)))));
    }
}