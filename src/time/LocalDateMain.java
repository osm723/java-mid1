package time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println("nowDate = " + nowDate);
        LocalDate localDate = LocalDate.of(2024, 04, 24);
        System.out.println("localDate = " + localDate);

        LocalDate plusDays = localDate.plusDays(10);
        System.out.println("plusDays = " + plusDays);
    }
}
