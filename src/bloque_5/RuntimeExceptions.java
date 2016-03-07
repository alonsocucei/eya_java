package bloque_5;

/**
 * @author alonsocucei
 */
public class RuntimeExceptions {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3};
        
        System.out.println(numbers[0]);
//        System.out.println(numbers[3]);
        
        System.out.println(14/2);
//        System.out.println(14/0);
        
        String name = "Alonso";
        
        System.out.println(name.toUpperCase());
        name = null;
//        System.out.println(name.toUpperCase());
        
        int positivo = -2;
        
        if (positivo < 0) {
            throw new ArithmeticException("Negative numbers are not allowed.");
        }
    }
}

/**
 * To check:
 * - What's an Exception?
 * - Most common RuntimeExceptions: NullPointerException, ArrayIndexOutOfBoundsException
 * ArithmeticException, ClassCastException, NumberFormatException.
 * - What's the exceptions class hierarchy?
 * - How can I throw an exception?
 */