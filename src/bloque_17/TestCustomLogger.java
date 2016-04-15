package bloque_17;

import java.util.Arrays;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author alonsocucei
 */
public class TestCustomLogger {
    private static Handler handler;
    
    public static void main(String[] args) {
//        handler = new ConsoleHandler(); //by default has INFO level
        try {
            handler = new FileHandler("file.log");
            System.out.printf("FileHandler Level: %s\n", handler.getLevel());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        Logger logger = Logger.getLogger("bloque_17");
        logger.setUseParentHandlers(false);
        logger.setLevel(Level.FINER);
//        handler.setLevel(Level.FINE);
        logger.addHandler(handler);
        System.out.printf("Level: %s\n", logger.getLevel());
        System.out.printf("Name: %s\n", logger.getName());
        System.out.printf("Handlers: %s\n", Arrays.toString(logger.getHandlers()));
        System.out.printf("Parent: %s\n", logger.getParent());
        System.out.printf("Parent name: %s\n", logger.getParent().getName());
        System.out.printf("Parent Level: %s\n", logger.getParent().getLevel());
        System.out.printf("Parent handlers: %s\n", Arrays.toString(logger.getParent().getHandlers()));
        
        logger.severe("severe");
        logger.warning("warning");
        logger.info("info");
        logger.config("config");
        logger.fine("fine");
        logger.finer("finer");
        logger.finest("finest");
    }
}

/**
 * To check:
 * - How can the root logger turn off?
 * - How default log level can be changed?
 */