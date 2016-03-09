package bloque_9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author alonsocucei
 */
public class TestBoundaries {
    public static void main(String[] args) {
        String target = "uno once aunoa veintiuno";
        String regex = "\\Buno\\B";
//        String target = "anita lava la tina";
//        String regex = "(\\B|\\b)[an]{2}(\\B|\\b)";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(target);
        
        while (matcher.find()) {
            System.out.print(matcher.group());
            System.out.print(" start: " + matcher.start());
            System.out.println(" end: " + matcher.end());
        }
        
        String emailRegex = "[a-z\\._0-9]+@[a-z]+\\.[a-z]{2,3}(.[a-z]{2,3})?";
        System.out.println("alonsocucei@yahoo.com.mx".matches(emailRegex));
    }
}

/**
 * To check:
 * - How boundaries match strings?
 * - What other boundaries exist?
 * - How can be applied to the replace menu in NetBeans?
 */