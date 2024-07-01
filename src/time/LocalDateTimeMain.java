package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {

        LocalDateTime nowDt = LocalDateTime.now();
        System.out.println("nowDt = " + nowDt);
        LocalDateTime localDateTime = LocalDateTime.of(2024, 4, 24, 13, 8, 10);
        System.out.println("localDateTime = " + localDateTime);

        LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime1 = " + localDateTime1);
        LocalDateTime localDateTime2 = localDateTime.plusDays(10);
        System.out.println("localDateTime2 = " + localDateTime2);
        LocalDateTime localDateTime3 = localDateTime2.plusYears(1);
        System.out.println("localDateTime3 = " + localDateTime3);


        System.out.println("nowDt = " + nowDt);

        boolean before = nowDt.isBefore(localDateTime3);
        System.out.println("before = " + before);

        boolean after = nowDt.isAfter(localDateTime3);
        System.out.println("after = " + after);

        boolean equal = nowDt.isEqual(nowDt);
        System.out.println("equal = " + equal);

        boolean equals = nowDt.equals(nowDt);
        System.out.println("equals = " + equals);
    }
}
