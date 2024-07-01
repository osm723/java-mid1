package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {

    public static void main(String[] args) {
        ChronoUnit[] values = ChronoUnit.values();
        for (ChronoUnit value : values) {
            System.out.println("value = " + value);
        }
        System.out.println("ChronoUnit.HOURS = " + ChronoUnit.HOURS);
        System.out.println("ChronoUnit.HOURS.getDuration() = " + ChronoUnit.HOURS.getDuration().getSeconds());
        System.out.println("ChronoUnit.DAYS = " + ChronoUnit.DAYS);
        System.out.println("ChronoUnit.DAYS.getDuration().getSeconds() = " + ChronoUnit.DAYS.getDuration().getSeconds());

        LocalTime localTime1 = LocalTime.of(1, 20, 30);
        LocalTime localTime2 = LocalTime.of(1, 30, 0);
        long between = ChronoUnit.SECONDS.between(localTime1, localTime2);
        System.out.println("between = " + between);

        long between1 = ChronoUnit.MINUTES.between(localTime1, localTime2);
        System.out.println("between1 = " + between1);

    }
}
