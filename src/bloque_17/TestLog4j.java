package bloque_17;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * @author alonsocucei
 */
public class TestLog4j {

    public static void main(String[] args) {
        Logger logger = LogManager.getLogger("bloque_17");
//        Logger logger = LogManager.getRootLogger();
        logger.trace("trace message");
        logger.info("Hello this is an info message");
        logger.error("otro error");
    }
}
