package time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        System.out.println("nowTime = " + nowTime);
        LocalTime localTime = LocalTime.of(9, 10, 30);
        System.out.println("nowTime = " + nowTime);
        System.out.println("localTime = " + localTime);


        LocalTime plusSeconds = localTime.plusSeconds(40);
        System.out.println("plusSeconds = " + plusSeconds);
    }
}
