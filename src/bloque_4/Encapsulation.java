package bloque_4;

/**
 * @author alonsocucei
 */
public class Encapsulation {
    public static void main(String[] args) {
        Product vegetable = new Product();
        vegetable.setName("jitomate rojo");
        vegetable.setName("tomate rojo");

        System.out.println(vegetable.getName());
    }
}

class Product {
    private int id;
    private String name;
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}

/**
 * To check:
 * - What's encapsulation?
 * - Why is it used?
 */