package bootcamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

import static java.time.Month.OCTOBER;

public class LocalDateTimeTest {

    public static void main(String[] args) {
        localDateTime();
        localDate();
        localTime();
        createSpecificDate();
        getAvailableZoneIds();
    }

    private static void localDateTime(){
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
    }

    private static void localDate(){
        LocalDate date = LocalDate.now();
        System.out.println(date);
    }

    private static void localTime() {
        LocalTime time = LocalTime.now();
        System.out.println(time);
    }

    private static void createSpecificDate(){
        System.out.println(LocalDateTime.of(2022, OCTOBER, 27, 12, 1));
    }

    private static void getAvailableZoneIds(){
        System.out.println(LocalDateTime.now(ZoneId.of("Indian/Comoro")));
    }
}
