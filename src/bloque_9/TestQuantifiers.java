package bloque_9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author alonsocucei
 */
public class TestQuantifiers {
    public static void main(String[] args) {
        String target = "unounouno";
        String regex = "(uno)*";
//        String target = "uno once veintiuno un";
//        String regex = "un.+";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(target);
        
        while (matcher.find()) {
            System.out.print(matcher.group());
            System.out.print(" start: " + matcher.start());
            System.out.println(" end: " + matcher.end());
        }
    }
}

/**
 * To check:
 * - What are the quantifiers used in regex?
 * - How these quantifiers consume the string?
 * - What are examples of invalid expressions?
 */