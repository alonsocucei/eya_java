package bloque_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author alonsocucei
 */
public class CollectionsTypes {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alonso");
        names.add("Lety");
        names.add("Alonso");
        names.add("Lety");
//        names.add(5);
        System.out.println(names);
        
        Set<String> namesSet = new HashSet<>(names);
        namesSet.add("nombre");
        namesSet.remove("Alonso");
        System.out.println(namesSet);
        
        Map<String, String> lastNamesMap = new HashMap<>();
        lastNamesMap.put("Sanchez Fuentes", "Alonso");
        lastNamesMap.put("Last Name", "Lety");
        
        System.out.println(lastNamesMap);
        
        System.out.println(lastNamesMap.get("Last Name"));
    }
}

/**
 * To check:
 * - How List, Set, Map store data?
 */