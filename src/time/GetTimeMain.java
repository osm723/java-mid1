package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2024, 4, 24, 13, 8, 0);
        System.out.println("localDateTime.get(ChronoField.YEAR) = " + localDateTime.get(ChronoField.YEAR));
        System.out.println("localDateTime.get(ChronoField.MONTH_OF_YEAR) = " + localDateTime.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("localDateTime.get(ChronoField.DAY_OF_MONTH) = " + localDateTime.get(ChronoField.DAY_OF_MONTH));
        System.out.println("localDateTime.get(ChronoField.HOUR_OF_DAY) = " + localDateTime.get(ChronoField.HOUR_OF_DAY));
        System.out.println("localDateTime.get(ChronoField.MINUTE_OF_HOUR) = " + localDateTime.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("localDateTime.get(ChronoField.SECOND_OF_MINUTE) = " + localDateTime.get(ChronoField.SECOND_OF_MINUTE));

        System.out.println("=======================================");

        System.out.println("localDateTime.get(ChronoField.YEAR) = " + localDateTime.getYear());
        System.out.println("localDateTime.get(ChronoField.MONTH_OF_YEAR) = " + localDateTime.getMonthValue());
        System.out.println("localDateTime.get(ChronoField.DAY_OF_MONTH) = " + localDateTime.getDayOfMonth());
        System.out.println("localDateTime.get(ChronoField.HOUR_OF_DAY) = " + localDateTime.getHour());
        System.out.println("localDateTime.get(ChronoField.MINUTE_OF_HOUR) = " + localDateTime.getMinute());
        System.out.println("localDateTime.get(ChronoField.SECOND_OF_MINUTE) = " + localDateTime.getSecond());

        System.out.println("=======================================");

        System.out.println("localDateTime.get(ChronoField.MINUTE_OF_DAY) = " + localDateTime.get(ChronoField.MINUTE_OF_DAY));
        System.out.println("localDateTime.get(ChronoField.SECOND_OF_DAY) = " + localDateTime.get(ChronoField.SECOND_OF_DAY));
    }
}
