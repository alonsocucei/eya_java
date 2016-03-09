package bloque_10;

/**
 * @author alonsocucei
 */
public class ThreadLifeCycle {
    public static void main(String[] args) {
        ThreadLife livingThread = new ThreadLife();
        Thread wrapperThread = new Thread(livingThread);
        
        wrapperThread.start();
    }
}

class ThreadLife implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

/**
 * To check:
 * - What states does a thread have?
 * - What actions/operations make the thread changes to a different state?
 */