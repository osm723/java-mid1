package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);
        System.out.println("startDate = " + startDate);
        System.out.println("endDate = " + endDate);
        
        Period period = Period.between(startDate, endDate);
        System.out.println("period.getYears() = " + period.getYears());
        System.out.println("period.getMonths() = " + period.getMonths());
        System.out.println("period.getDays() = " + period.getDays());
        long between1 = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("between1 = " + between1);
    }
}
