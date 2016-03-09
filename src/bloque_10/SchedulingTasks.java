package bloque_10;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author alonsocucei
 */
public class SchedulingTasks {

    public static void main(String[] args) {
        Timer timer = new Timer();
        Timer timer2 = new Timer();
        MyTask task1 = new MyTask("task1", 3);
        MyTask task2 = new MyTask("task2", 4);
        
        timer.schedule(task1, 0);
        timer2.schedule(task2, 0);
        timer2.schedule(new TimerTask() {public void run() { System.exit(0);}}, 0);
    }
}

class MyTask extends TimerTask {

    private int duration;
    private String name;

    public MyTask(String name, int duration) {
        this.duration = duration;
        this.name = name;
    }

    public void run() {
        int i = duration;

        while (i > 0) {
            try {
                System.out.printf("Task: %s, still %d seconds to finish.\n", name, i--);
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        System.out.printf("Task: %s, has finished.\n", name);
    }
}

/**
 * To check:
 * - Why program doesn't finish after tasks are executed?
 * - How the program can finish?
 * - What happens if every task is executed by a different timer?
 */
