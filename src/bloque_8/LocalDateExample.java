package bloque_8;

import java.time.LocalDate;
import static java.time.temporal.TemporalAdjusters.*;
import static java.time.DayOfWeek.*;

/**
 * @author alonsocucei
 */
public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate now;
        LocalDate bDate;
        LocalDate nowPlusMonth;
        LocalDate nextTues;
        
        now = LocalDate.now();
        System.out.println("Now: " + now);
        
        bDate = LocalDate.of(1984, 3, 21);
        System.out.println("My birthday: " + bDate);
        
        System.out.println("Is my birthday in the past? " + bDate.isBefore(now));
        System.out.println("Is my birthday in the future? " + bDate.isAfter(now));
        System.out.println("Is my birthday in a leap year? " + bDate.isLeapYear());
        System.out.println("Current year is a leap year? " + now.isLeapYear());
        System.out.println("My birthday day of the week: " + bDate.getDayOfWeek());
        System.out.println("Today's day of the week: " + now.getDayOfWeek());

        nowPlusMonth = now.plusMonths(1);
        System.out.println("The date a month from now: " + nowPlusMonth);
        
        nextTues = now.with(next(TUESDAY));
        System.out.println("Next Tuesday's date: " + nextTues);
    }
}

/**
 * To check:
 * - Do methods modify original object?
 * - How can we know a date in future?
 */