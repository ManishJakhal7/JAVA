import java.time.*;
import java.time.format.DateTimeFormatter;

public class Date {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        String dateTimeString = now.format(formatter);
        System.out.println(dateTimeString);
        // LocalDateTime localDateTime1 = now.plusYears(2);
        // System.out.println(localDateTime1);
        // LocalDateTime localDateTime2 = now.minusMonths(24);
        // System.out.println(localDateTime2);
        // LocalDateTime localDateTime3 = localDateTime1.minusYears(2);
        // System.out.println(localDateTime3);
        LocalDateTime localDateTime = LocalDateTime.of(2026, Month.JANUARY, 1, 10, 15);
        String dateTimeString1 = localDateTime.format(formatter);
        System.out.println(dateTimeString1);
        // System.out.println(localDateTime);

    }
}