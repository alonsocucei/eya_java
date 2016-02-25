package bloque_2;

/**
 * @author alonsocucei
 */
public class LoopControl {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("for: " + i);
        }
        
        int i = 0;
        while (i < 10) {
            System.out.println("while: " + i++);
//            if (i >= 6) break;
        }
        
        i = 0;
        do {
            System.out.println("do while: " + i++);
        } while (i < 10);
    }
}

/**
 * To check:
 * - loops: for, while and do while.
 * - What condition expressions are valid?
 * - Infinite loops.
 * - Which loop would be the best to print a menu? (exercise)
 * - Which loop would be the best to print arrays? (exercise)
 * - Which loop would be the best if iteration may happens or not? (exercise)
 */