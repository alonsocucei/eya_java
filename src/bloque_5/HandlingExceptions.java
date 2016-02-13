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
        CandleStore store = new CandleStore();
        
        Candle candle = store.sellCandle();
    }
}

class CandleStore {
    ArrayList candles = new ArrayList();
    
    public void addCandle() {
        candles.add(new Candle());
    }
    
    public Candle sellCandle() throws NoSuchElementException {
        return (Candle)candles.remove(0);
    }
}

class Candle {
    private String color = "white";
    Candle(String color) {this.color = color;}
    Candle() {}
}