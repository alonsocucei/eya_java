package bloque_10;

/**
 * @author alonsocucei
 */
public class SharedData {
    private static int i;
    
    public static void main(String[] args) {
        Runnable runnable = () -> {
            while (i < 50) {
                System.out.printf("Thread: %s, i:%d\n", Thread.currentThread().getName(), i++);
                
//                try {
//                    Thread.sleep((int)(Math.random() * 1000));
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
                
            }
        };
        
        Thread t1 = new Thread(runnable, "t1");       
        Thread t2 = new Thread(runnable, "t2");
        Thread t3 = new Thread(runnable, "t3");
        
        t1.start();
        t2.start();
        t3.start();
    }
}

/**
 * To check:
 * - What happens if try-catch block is commented?
 * - What happens if the printing line is moved after the try-catch block?
 */