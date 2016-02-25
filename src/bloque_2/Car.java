package bloque_2;

/**
 *
 * @author alonsocucei
 */
public class Car {
    String id;
    String marca;
    short modelo;
    double precio;
    
    public String toString() {
        return "id: " + id + " marca: " + marca + " modelo: " + modelo + 
                " precio:" + precio;
    }
}

/**
 * To check:
 * - What is abstraction?
 * - What is the context?
 * - What is the correct type for every attribute?
 * - What operations are valid for a user to call on a Car object?
 */