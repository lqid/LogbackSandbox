import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackSandbox {
    final static Logger logger = LoggerFactory.getLogger(LogbackSandbox.class);

    public static void main(String[] args) {
        executeLogbackLogging();
    }

    private static void executeLogbackLogging() {
        try {
            while (true) {
                logger.info("Running LogbackSandbox endless loop test");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            logger.warn(e.getMessage());
            Thread.currentThread().interrupt();
        }
    }
}
