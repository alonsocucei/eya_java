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

        LocalDate tvProgramDate = LocalDate.of(2016, MARCH, 31);
        LocalTime tvProgramTime = LocalTime.of(21, 45);
        tvProgram = LocalDateTime.of(tvProgramDate, tvProgramTime);
        System.out.println("TV program starts at: " + tvProgram);

        party = LocalDate.of(2016, MARCH, 21).atTime(13, 30);
        System.out.println("Party is on: " + party);
        
        courseStart = LocalDateTime.of(2016, MARCH, 28, 19, 00);
        courseEnd = courseStart.plusDays(2).plusHours(2);
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