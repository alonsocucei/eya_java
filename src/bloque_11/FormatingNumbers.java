package bloque_11;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author alonsocucei
 */
public class FormatingNumbers {
    public static void main(String[] args) {
        Locale mxLocale = new Locale("es", "MX");
        Locale geLocale = new Locale("de", "GE");
        NumberFormat mxFormatter = NumberFormat.getCurrencyInstance(mxLocale);
        NumberFormat geFormatter = NumberFormat.getCurrencyInstance(geLocale);
        
        System.out.printf("México: %s\n", mxFormatter.format(3000000));
        System.out.printf("Alemania: %s\n", geFormatter.format(3000000));
    }
}

/**
 * To check:
 * - How can numbers be formated for a specific locale?
 * - What else can be formated?
 */
