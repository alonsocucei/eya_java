package bloque_5;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * @author alonsocucei
 */

/**
 * Exercise: Add the code to handle the possible exception thrown in the best
 * way for the user, it must be easy to understand what happened.
 */
public class HandlingExceptions {
    public static void main(String[] args) {
        CandyStore store = new CandyStore();
        
        Candy candy = store.sellCandy();
    }
}

class CandyStore {
    ArrayList candies = new ArrayList();
    
    public void addCandy() {
        candies.add(new Candy());
    }
    
    public Candy sellCandy() throws NoSuchElementException {
        Candy c;
        
        try {
            c = (Candy)candies.remove(0);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException("There isn't any candies at the store");
        }
        
        return c;
    }
}

class Candy {
    private String color = "white";
    Candy(String color) {this.color = color;}
    Candy() {}
}