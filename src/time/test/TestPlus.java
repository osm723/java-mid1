package time.test;

import java.time.LocalDateTime;

public class TestPlus {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2024, 1, 1, 8, 8, 0);
        LocalDateTime localDateTime1 = localDateTime.plusMonths(2).plusDays(4).plusDays(3).plusHours(4);
        System.out.println("localDateTime1 = " + localDateTime1);
    }
}
