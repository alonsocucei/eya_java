package bloque_10;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author alonsocucei
 */
public class SchedulingActions {

    public static void main(String[] args) {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);
        Runnable task1 = createRunnable("task 1", 3);
        Runnable task2 = createRunnable("task 2", 3);
        
        executor.schedule(task1, 0, TimeUnit.SECONDS);
        executor.schedule(task2, 0, TimeUnit.SECONDS);
        executor.shutdown();
    }
    
    public static Runnable createRunnable(String name, int duration) {
        return () -> {
            int i = duration;
            String n = name;
            
            while (i > 0) {
                try {
                    Thread.sleep(1000);
                    System.out.printf("Action: %s still %d seconds to finish\n", n, i--);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.printf("Task: %s, has finished.\n", n);
        };
    }
}

/**
 * To check:
 * - How the execution of the program is modified if 2 is sent as argument to
 * ScheduledThreadPoolExecutor constructor?
 */
