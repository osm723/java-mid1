package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2024, 4, 24, 13, 8, 0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH:mm:ss");
        String format = localDateTime.format(formatter);
        System.out.println("format = " + format);
        System.out.println("localDateTime = " + localDateTime);

        String input = "2024년 04월 24일 13:08:00";
        LocalDateTime parse = LocalDateTime.parse(input, formatter);
        System.out.println("parse = " + parse);
    }
}
