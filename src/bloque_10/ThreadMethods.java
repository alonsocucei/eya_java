package bloque_10;

/**
 * @author alonsocucei
 */
public class ThreadMethods {
    public static void main(String[] args) {
        ThreadLife livingThread = new ThreadLife();
        Thread wrapperThread = new Thread(livingThread);
        wrapperThread.start();
        System.out.printf("ThreadLife thread:\n");
        System.out.printf("id: %s\n", wrapperThread.getId());
        System.out.printf("name: %s\n", wrapperThread.getName());
        System.out.printf("priority: %s\n", wrapperThread.getPriority());
        System.out.printf("state: %s\n", wrapperThread.getState());
        System.out.printf("is alive: %s\n", wrapperThread.isAlive());
        System.out.printf("is daemon: %s\n", wrapperThread.isDaemon());
        
        System.out.printf("\nmain thread:\n");
        Thread mainThread = Thread.currentThread();
        System.out.printf("id: %s\n", mainThread.getId());
        System.out.printf("name: %s\n", mainThread.getName());
        System.out.printf("priority: %s\n", mainThread.getPriority());
        System.out.printf("state: %s\n", mainThread.getState());
        System.out.printf("is alive: %s\n", mainThread.isAlive());
        System.out.printf("is daemon: %s\n", mainThread.isDaemon());
    }
}

/**
 * To check:
 * - What's a daemon thread?
 * - How many different priorities can a thread have?
 */