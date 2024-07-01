package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {

    public static void main(String[] args) {
        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration = " + duration);

        LocalTime localTime = LocalTime.of(1, 10);
        LocalTime plus = localTime.plus(duration);
        System.out.println("localTime = " + localTime);
        System.out.println("plus = " + plus);

        LocalTime localTime1 = LocalTime.of(10, 30);
        LocalTime localTime2 = LocalTime.of(13, 50);
        Duration between = Duration.between(localTime1, localTime2);
        System.out.println("between.getSeconds() = " + between.getSeconds());
        System.out.println("between.toHours() = " + between.toHours());
        System.out.println("between.toMinutesPart() = " + between.toMinutesPart());
        System.out.println("between.toMinutes() = " + between.toMinutes());
    }
}
