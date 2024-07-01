package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2024, 4, 24);
        System.out.println("localDate = " + localDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String format = localDate.format(formatter);
        System.out.println("format = " + format);

        String input = "2024년 04월 24일";
        LocalDate parse = LocalDate.parse(input, formatter);
        System.out.println("parse = " + parse);
    }
}
