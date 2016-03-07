package bloque_8;

import java.time.LocalDateTime;
import static java.time.Month.MARCH;
import static java.time.temporal.ChronoUnit.*;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author alonsocucei
 */
public class LocalDateTimeExample {

    public static void main(String[] args) {
        LocalDateTime party;
        LocalDateTime tvProgram;
        LocalDateTime courseStart;
        LocalDateTime courseEnd;

        party = LocalDate.of(2014, MARCH, 21).atTime(13, 30);
        System.out.println("Party is on: " + party);

        LocalDate flightDate = LocalDate.of(2014, MARCH, 31);
        LocalTime flightTime = LocalTime.of(21, 45);
        tvProgram = LocalDateTime.of(flightDate, flightTime);
        System.out.println("TV program starts at: " + tvProgram);

        courseStart = LocalDateTime.of(2014, MARCH, 24, 9, 00);
        courseEnd = courseStart.plusDays(4).plusHours(8);
        System.out.println("Course starts: " + courseStart);
        System.out.println("Course ends:   " + courseEnd);

        long courseHrs = (courseEnd.getHour() - courseStart.getHour()) * (courseStart.until(courseEnd, DAYS) + 1);
        System.out.println("Course is:     " + courseHrs + " hours long.");
    }
}

/**
 * To check:
 * - What's LocalTime class for?
 * - How can be combined LocalTime and LocalDate classes?
 * - 
 */