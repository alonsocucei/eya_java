package bloque_1;

/**
 * @author alonsocucei
 */
public class Variables {
    int a;
    
    public static void main(String[] args) {
        int decimal = 5;
        int binario = 0b101;
        int octal = 021;
        int hexa = 0x11;
        double cien = 1e2; //engineering notation
        char c = 'a';
        char unicode = '\u0040'; //using unicode
        boolean b = true;
        Object o = null;
//        int 1abc; // compile error
//        int ?abc; //compile error
        System.out.println(decimal);
        System.out.println(binario);
        System.out.println(cien);
        System.out.println(octal);
        System.out.println(hexa);
        System.out.println(unicode);
    }
}

/**
 * To check:
 * - What are the rules to declare a valid identifier?
 * - What are the code conventions?
 * - What's a literal?
 * - What are the 2 kinds of variables?
 * - What are the scopes where a variable may be declared?
 * - What's engineering notation?
 * - How numbers are declared in base 2, 8 and 16?
 * - What's UNICODE?
 * - What's the default value for variables? (exercise)
 */