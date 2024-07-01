package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class TestCalendarPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("년도를 입력하세요 : ");
        int year = scanner.nextInt();

        System.out.println("월을 입력하세요 : ");
        int month = scanner.nextInt();

        printCalendar(year, month);
    }

    private static void printCalendar(int year, int month) {
        LocalDate firstMonth = LocalDate.of(year, month, 1);
        LocalDate nextMonth = firstMonth.plusMonths(1);

        int weekDays = firstMonth.getDayOfWeek().getValue() % 7;

        System.out.println("Su Mo Tu We Th Fi Sa ");
        for (int i = 0; i < weekDays; i++) {
            System.out.print("   ");
        }

        LocalDate iterator = firstMonth;
        while (iterator.isBefore(nextMonth)) {
            System.out.printf("%2d ", iterator.getDayOfMonth());
            if (iterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            iterator = iterator.plusDays(1);
        }

    }
}
