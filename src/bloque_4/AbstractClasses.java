package bloque_4;

/**
 * @author jjsanche
 */
public class AbstractClasses {
    public static void main(String[] args) {
//        Clothing c = new Clothing();
        Skirt s = new Skirt();
        Pants ps = new Pants();
        s.getPrice();
        s.wash();
        
        ps.getPrice();
        ps.wash();
    }
}

abstract class Clothing {
    private int id;
    private String name;
    private double price;
    
    public double getPrice() {
        return price;
    }
    
    public abstract void wash();
}

class Skirt extends Clothing {
    int large;
    
    public void wash() {
        System.out.println("lavado a mano");
    }
}

class Pants extends Clothing {
    char color;
    
    public void wash() {
        System.out.println("lavado en seco");
    }
}

/**
 * To check:
 * - What's an abstract class?
 * - What's the syntax to declare abstract classes?
 * - When abstract classes must be used?
 * - What type of methods an abstract class may declare?
 */