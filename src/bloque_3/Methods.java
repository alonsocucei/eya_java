package bloque_3;

/**
 * @author alonsocucei
 */
public class Methods {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);
        modifyInt(a);
        System.out.println(a);
        
        String uno = "uno";
        String dos = "dos";
        switchReferences(uno, dos);
    }
    
    private static void method() {}
    private static void method2(int a) {return;}
    private static int method3() {return 0;}
    private static int method4(int a) {return a;}
    
    private static void modifyInt(int i) {
        i += 3;
        System.out.println("modifyInt: " + i);
    }
    
    private static void switchReferences(String a, String b) {
    }
}

/**
 * To check:
 * - What's method's syntax declaration?
 * - What's the coding standard to name methods?
 * - How arguments are passed to a method? (exercise)
 */