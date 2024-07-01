package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjustors {

    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        LocalDate localDate = LocalDate.of(year, month, 1);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        DayOfWeek lastOfWeek = localDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
        System.out.println("dayOfWeek = " + dayOfWeek);
        System.out.println("lastOfWeek = " + lastOfWeek);
    }
}
