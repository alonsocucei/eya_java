package bloque_11;

import java.util.Locale;

/**
 * @author alonsocucei
 */
public class TestLocale {
    public static void main(String[] args) {
        Locale defaultLocale = Locale.getDefault();
//        Locale customLocale = new Locale("en", "MX");
//        defaultLocale = customLocale;
        
        System.out.println(defaultLocale);
        System.out.printf("country: %s\n", defaultLocale.getCountry());
        System.out.printf("display country: %s\n", defaultLocale.getDisplayCountry());
        System.out.printf("ISO3 country: %s\n", defaultLocale.getISO3Country());
        System.out.printf("language: %s\n", defaultLocale.getLanguage());
        System.out.printf("display language: %s\n", defaultLocale.getDisplayLanguage());
        System.out.printf("ISO3 language: %s\n", defaultLocale.getISO3Language());
        System.out.printf("display name: %s\n", defaultLocale.getDisplayName());
        System.out.printf("tag: %s\n", defaultLocale.toLanguageTag());
        
//        for (Locale locale: Locale.getAvailableLocales()) {
//            System.out.println(locale);
//        }
    }
}

/**
 * To check:
 * - What's a Locale?
 * - What are the predefined locales?
 * - How can a custom Locale be created?
 * - What locales are installed by default?
 */