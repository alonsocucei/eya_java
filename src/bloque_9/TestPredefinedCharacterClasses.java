package bloque_9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author alonsocucei
 */
public class TestPredefinedCharacterClasses {
    public static void main(String[] args) {
        String target = "15. 38 next $43_22 ";
        String regex_d = "\\d"; //[a-zA-Z0-9_]
        
        Pattern pattern = Pattern.compile(regex_d);
        Matcher matcher = pattern.matcher(target);

        while (matcher.find()) {
            System.out.print(matcher.group());
            System.out.print(" start: " + matcher.start());
            System.out.println(" end: " + matcher.end());
        }
        
        System.out.println(matcher.replaceAll("a"));
    }
}
        
/**
 * To check:
 * - What are the common predefined character classes?
 * - How the start() and end() methods of Matcher pattern work?
 * - What other methods the Matcher class contains?
 */