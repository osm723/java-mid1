package time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeMain {

    public static void main(String[] args) {

        OffsetDateTime now = OffsetDateTime.now();
        System.out.println("now = " + now);


        LocalDateTime localDateTime = LocalDateTime.of(2024, 4, 24, 13, 8, 0);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, ZoneOffset.of("+01:00"));
        System.out.println("localDateTime = " + localDateTime);
        System.out.println("offsetDateTime = " + offsetDateTime);
    }
}
