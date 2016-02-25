package bloque_3;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author alonsocucei
 */
public class TestArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(1000);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(1);
//        list.add(true);
//        list.add("cadena");
//        list.add(3.2);
        
        list.remove(0);
        list.set(3, 10);
        System.out.println("size: " + list.size());
        System.out.println(list.get(1));
        System.out.println(list);
        
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//        
//        for (Object element :list) {
//            System.out.println(element);
//        }
        
        Collections.sort(list);
        System.out.println(list);
    }
}

/**
 * To check:
 * - What's the difference between ArrayList and Arrays?
 * - What can be stored in an ArrayList?
 * - How an ArrayList can be sorted?
 * - How to iterate through an ArrayList?
 */