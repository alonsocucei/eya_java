package bloque_9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author alonsocucei
 */
public class TestCharacterClasses {
    public static void main(String[] args) {
        String target = "Im fine to dine at nine";
        //simple
        String regex = "[fdn]ine";
        
        //range
        String regexRange = "[c-k]ine";
        
        //negation
        String regexNegation = "[^dn]ine";
        
        String twoCharsRegex = "[a-zA-Z]{2}";
        
        Pattern pattern = Pattern.compile(twoCharsRegex);
        Matcher matcher = pattern.matcher(target);
        
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

/**
 * To check:
 * - How the Pattern and Matcher classes work?
 * - How a regex ask if a text to search contains a single character?
 * - How a regex ask if a text to search contains a range of characters?
 * - How a regex ask if a text to search doesn't contain a range of characters?
 */