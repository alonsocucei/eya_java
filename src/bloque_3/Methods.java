package bloque_3;

/**
 * @author alonsocucei
 */
public class Methods {
    private int a = 10;
    
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);
        modifyInt(a);
        System.out.println(a);
        
        Methods m = new Methods();
        m.method();
        
        System.out.println(m.a);
        modifyObject(m);
        System.out.println(m.a);
        
        method2(9);
        int suma = method3() + 10;
        System.out.println(suma);
        System.out.println(method4(6));
        
        String uno = "uno";
        String dos = "dos";
        
        switchReferences(uno, dos);
        
        System.out.println("uno: " + uno);
        System.out.println("dos: " + dos);
    }
    
    private void method() {
        System.out.println("method");
    }
    
    private static void method2(int a) {
        System.out.println("method2");
        return;
    }
    
    private static int method3() {
        System.out.println("method3");
        return 78;
    }
    
    private static int method4(int a) {
        System.out.println("method4");
        return a + 4;
    }
    
    private static void modifyInt(int i) {
        i += 3;
        System.out.println("modifyInt: " + i);
    }
    
    private static void switchReferences(String a, String b) {
        String temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
    
    private static void modifyObject(Methods m) {
        m.a = 12;
    }
}

/**
 * To check:
 * - What's method's syntax declaration?
 * - What's the coding standard to name methods?
 * - How arguments are passed to a method? (exercise)
 */