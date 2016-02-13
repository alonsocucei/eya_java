package bloque_4;

/**
 * @author alonsocucei
 */
public class Encapsulation {
    public static void main(String[] args) {
        Product vegetable = new Product();
        vegetable.id = 1;
        vegetable.name = "tomate rojo";
        
        vegetable.name = "jitomate rojo";
    }
}

class Product {
    public int id;
    public String name;
}

/**
 * To check:
 * - What's encapsulation?
 * - Why is it used?
 */