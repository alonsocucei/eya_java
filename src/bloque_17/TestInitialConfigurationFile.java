package bloque_17;

import java.util.Arrays;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

/**
 *
 * @author jjsanche
 */
public class TestInitialConfigurationFile {

    private static Handler handler;

    public static void main(String[] args) {
        handler = new ConsoleHandler();
        Logger logger = Logger.getLogger("bloque_17");
        logger.setUseParentHandlers(false);
        logger.addHandler(handler);
        System.out.printf("Level: %s\n", logger.getLevel());
        System.out.printf("Name: %s\n", logger.getName());
        System.out.printf("Handlers: %s\n", Arrays.toString(logger.getHandlers()));
        System.out.printf("Handler level: %s\n", handler.getLevel());
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
 * - When there's a global level, handler level and logger level set to different
 * values, which one is used?
 */