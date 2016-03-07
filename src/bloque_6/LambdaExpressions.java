package bloque_6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author alonsocucei
 */
public class LambdaExpressions {
    public static void main(String[] args) {
        String test = "Lety";
        
        Predicate instance = new PredicateImpl();
        Predicate isNotNull = t -> t != null;
        Predicate<String> startsUpperCase = s -> Character.isUpperCase(s.charAt(0));
        Predicate<String> hasDigits = s -> s.matches(".*\\d.*");
        
        System.out.println("is not null: " + isNotNull.test(test));
        System.out.println("starts with upper case: " + startsUpperCase.test(test));
        System.out.println("has digits: " + hasDigits.test(test));
        
        List<String> names = new ArrayList<>();
        names.add("Lety");
        names.add("Alonso");
        names.add("Carolina");
        names.add("Cesar");
        names.add("Jorge");
        names.add("Paulina");
        
        System.out.println(names);
        for (String s: names) {
            System.out.println(s.toUpperCase());
        }
        
        for (String s: names) {
            System.out.println(s.toLowerCase());
        }
        
        System.out.println("Using lambda expressions:");
        names.forEach(a -> System.out.println(a.toUpperCase()));
        names.forEach(a -> System.out.println(a.toLowerCase()));
    }
}

class PredicateImpl implements Predicate {
    public boolean test(Object o) {
        return true;
    }
}

/**
 * To check:
 * - What's a lambda expression?
 * - Where they are used?
 * - What's the syntax for a lambda expression?
 * - How a collection can be printed using lambda expressions? (exercise)
 */