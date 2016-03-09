package bloque_8;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * @author alonsocucei
 */
public class OffsetDateTimeExample {

  public static void main(String[] args) {
    ZoneOffset mexicoCity = ZoneOffset.ofHours(-6);
    ZoneOffset bangaloreCity = ZoneOffset.ofHours(5);
    
    LocalDateTime javaCourse = LocalDateTime.of(2016, Month.MARCH, 28, 19, 0);
    OffsetDateTime offsetJavaCourse =  OffsetDateTime.of(javaCourse, mexicoCity);
    
    OffsetDateTime offsetJavaCourseBangalore = offsetJavaCourse.withOffsetSameInstant(bangaloreCity);
    
    System.out.println("Course (Mexico City) timme is at: " + offsetJavaCourse);
    System.out.println("Course (Bangalore) time is at:      " + offsetJavaCourseBangalore);
  }
}

/**
 * To check:
 * - How time zones are handled?
 * - What can be used if offset is not known?
 * - How would you determine a flight arrival in both departure and arrival locations? (exercise)
 */