package pac1;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;

public class lesson_dateTime {
    public static void main(String[] args) {

        Instant currentT = Instant.now();
        System.out.println(currentT);

        LocalDate rightnow = LocalDate.now();
        LocalDate independence = LocalDate.of(1947, Month.AUGUST, 15);
        System.out.println("Independence: " + independence);
        System.out.println("Today: " + rightnow);
        System.out.println("Tomorrow: " + rightnow.plusDays(1));
        System.out.println("Last Month: " + rightnow.minusMonths(1));
        System.out.println("Is Leap: " + rightnow.isLeapYear());
        System.out.println("Move to 30th day of month: " + rightnow.withDayOfMonth(20));


    }
}
