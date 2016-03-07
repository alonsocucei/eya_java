package bloque_8;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @author alonsocucei
 */
public class DateTimeFormatterExample {

    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(now.format(formatter));
        
        formatter = DateTimeFormatter.ISO_ORDINAL_DATE;
        System.out.println(now.format(formatter));

        formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter formatterm = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        DateTimeFormatter formatterl = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        DateTimeFormatter formatterf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);

        System.out.println(now.format(formatter));
        System.out.println(now.format(formatterm));
        System.out.println(now.format(formatterl));
        System.out.println(now.format(formatterf));
        
        formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy G, hh:mm a 'Q'q VV");
        System.out.println(now.format(formatter));
    }
}

/**
 * To check:
 * - What are the predefined formats?
 * - What are the predefined style formats?
 * - How can custom formats be created?
 */