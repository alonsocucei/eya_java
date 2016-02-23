package bloque_1;

/**
 * @author alonsocucei
 */
public class PrimitiveTypes {
    public static void main(String[] args) {
        System.out.println("byte: " + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE);
        System.out.println("int: " + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);
        System.out.println(3 + 5);
        System.out.println(3.2 + 5);
        
        byte b = 10;
        int i = b;
        long l = Long.MAX_VALUE;
        System.out.println(l);
        short s = (short)l; //assigns only the first 16 of the 64 bits.
        System.out.println(s);
        
        char c = (char) 64.3;
        char pc = (byte) 97;
//        boolean bo = (boolean) 35; //compile error
        System.out.println(c);
        System.out.println(pc);
    }
}

/**
 * To check:
 * - What is the capacity in bytes/bit for every primitive type?
 * - What is the range of values for every primitive type?
 * - What is the default type for integer literals? (exercise)
 * - What is the default type for decimal literals? (exercise)
 * - How math operations are affected by data types? 
 * - What is promotion? (exercise)
 * - What is casting? (exercise)
 */