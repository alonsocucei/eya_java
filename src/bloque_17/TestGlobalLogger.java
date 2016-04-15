package bloque_17;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;
/**
 * @author alonsocucei
 */
public class TestGlobalLogger {
    public static void main(String argv[]) throws IOException {
        Logger logger = Logger.getGlobal();
        System.out.printf("Level: %s\n", logger.getLevel());
        System.out.printf("Name: %s\n", logger.getName());
        System.out.printf("Handlers: %s\n", Arrays.toString(logger.getHandlers()));
        System.out.printf("Parent: %s\n", logger.getParent());
        System.out.printf("Parent name: %s\n", logger.getParent().getName());
        System.out.printf("Parent Level: %s\n", logger.getParent().getLevel());
        System.out.printf("Parent handlers: %s\n", Arrays.toString(logger.getParent().getHandlers()));
        
//        logger.setLevel(Level.CONFIG);
//        System.out.printf("Level: %s\n", logger.getLevel());
        
        logger.log(Level.SEVERE, "severo general");
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
 * - What happens if log level is changed for global logger?
 */