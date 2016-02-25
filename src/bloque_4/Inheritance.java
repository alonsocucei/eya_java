package bloque_4;

/**
 * @author alonsocucei
 */
public class Inheritance {
    public static void main(String[] args) {
        A a = new A();
        a.p = 5;
        B b = new B();
        
        System.out.println(a.p);
        System.out.println(b.p);
    }
}

class A {
    private int a = 'a';
    public int p = 10;
    int d = 5;
    protected int pro = 7;
}

class B extends A {
    public B() {
        super.p += 6;
    }
}

/**
 * To check:
 * - What's inheritance?
 * - How a class inherits from another class?
 * - What a subclass can access from its parent class?
 * - When inheritance must be used?
 * - How access modifiers affect inheritance?
 * - How many levels a class hierarchy can have?
 */