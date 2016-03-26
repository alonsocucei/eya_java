package bloque_10;

import java.util.HashSet;
import java.util.Set;

/**
 * @author alonsocucei
 */
public class SynchronizedSharedData {

    private static int i;
    private static Set<Integer> numbers = new HashSet<>();

    public static void main(String[] args) {
        Runnable runnable = () -> {
            synchronized (numbers) {
                while (i < 100) {
//                    System.out.printf("Thread: %s, i:%d\n", Thread.currentThread().getName(), i++);

//                    try {
//                        Thread.sleep((int) (Math.random() * 1000));
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }

                    numbers.add(i);
                    i ++;
                }
            }

            synchronized(numbers) {
                System.out.printf("total numbers: %d\n", numbers.size());
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
 * To check: -
 */
