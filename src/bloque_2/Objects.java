package bloque_2;

/**
 * @author alonsocucei
 */
public class Objects {
    String name;
    String desc;
    
    public Objects() {
        name = "unknown";
    }
    
    public Objects(String name) {
        this.name = name;
    }
    
    public String toString() {
        return "name: " + name + " desc: " + desc;
    }
    
    public static void main(String[] args) {
        Objects o = new Objects();
        System.out.println(o.name);
        o.name = "Alonso";
        
        Objects o2 = new Objects();
        o2.name = "Lety";
        
        Objects o3 = new Objects("Cesar");
        
        System.out.println(o.name);
        System.out.println(o2.name);
        System.out.println(o3.name);
        
        System.out.println(o3);// prints class name @ hash code
        System.out.println(o3.toString());// prints class name @ hash code
        
//        Objects o4 = null;
//        System.out.println(o4.name);
    }
}

/**
 * To check:
 * - What a reference variable stores?
 * - What are valid values for a reference variable? (exercise)
 * - What's the syntax to create objects?
 * - What happens when assigning a reference value to another reference variable?
 * - What's a NullPointerException?
 * - What's printed when an object is passed as argument to the print() method?
 */