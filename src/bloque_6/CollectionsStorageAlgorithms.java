package bloque_6;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author alonsocucei
 */
public class CollectionsStorageAlgorithms {

    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();
        List<String> names = new LinkedList<>();
        names.add("Alonso");
        names.add("Lety");
        names.add("Cesar");
        names.add("Lety");
        System.out.println(names);
        
        Set<String> namesSet = new HashSet<>(names);
        System.out.println(namesSet);
        
        Set<String> sortedSet = new TreeSet<>(namesSet);
        System.out.println(sortedSet);
    }
}

/**
 * To check:
 * - What ordered, sorted and unordered means when talking about collections?
 * - What collections are ordered?
 * - What collections are sorted?
 * - What collections are unordered?
 */
