package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {

    public static void main(String[] args) {

        Instant now = Instant.now();
        System.out.println("now = " + now);

        ZonedDateTime now1 = ZonedDateTime.now();
        Instant from = Instant.from(now1);
        System.out.println("from = " + from);

        Instant instant = Instant.ofEpochSecond(0);
        System.out.println("instant = " + instant);
        Instant instant1 = Instant.ofEpochSecond(100);
        System.out.println("instant1 = " + instant1);

        Instant instant2 = instant.plusSeconds(3600);
        System.out.println("instant2 = " + instant2);

        long epochSecond = instant2.getEpochSecond();
        System.out.println("epochSecond = " + epochSecond);
    }
}
