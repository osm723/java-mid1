package time;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChangeTimeMain {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2024, 4, 24, 13, 8, 0);
        System.out.println("localDateTime = " + localDateTime);
        LocalDateTime plus0 = localDateTime.plus(10, ChronoUnit.YEARS);
        System.out.println("plus0 = " + plus0);
        LocalDateTime plus1 = localDateTime.plusYears(10);
        System.out.println("plus1 = " + plus1);
        Period period = Period.ofYears(10);
        LocalDateTime plus2 = localDateTime.plus(period);
        System.out.println("plus2 = " + plus2);

    }
}
