package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2024, 4, 24, 13, 8, 0);
        System.out.println("localDateTime = " + localDateTime);

        LocalDateTime localDateTime1 = localDateTime.with(ChronoField.YEAR, 2025);
        System.out.println("localDateTime1 = " + localDateTime1);

        LocalDateTime localDateTime2 = localDateTime.withYear(2025);
        System.out.println("localDateTime2 = " + localDateTime2);

        LocalDateTime localDateTime3 = localDateTime.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("localDateTime3 = " + localDateTime3);

        LocalDateTime localDateTime4 = localDateTime.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        System.out.println("localDateTime4 = " + localDateTime4);
    }
}
