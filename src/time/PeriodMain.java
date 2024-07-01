package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {

    public static void main(String[] args) {
        Period period = Period.ofDays(10);
        System.out.println("period = " + period);


        LocalDate localDate = LocalDate.of(2024, 4, 24);
        LocalDate plus = localDate.plus(period);
        System.out.println("localDate = " + localDate);
        System.out.println("plus = " + plus);

        LocalDate localDate1 = LocalDate.of(2024, 4, 24);
        LocalDate localDate2 = LocalDate.of(1988, 7, 23);
        Period between = Period.between(localDate2, localDate1);
        System.out.println("between.getYears() = " + between.getYears());
        System.out.println("between.getMonths() = " + between.getMonths());
        System.out.println("between.getDays() = " + between.getDays());
    }
}
