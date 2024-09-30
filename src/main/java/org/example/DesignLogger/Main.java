package org.example.DesignLogger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.info("logger info 1");
        logger.error("logger error 1");
        logger.debug("logger debug 1");

        logger.setLoggerStrategy(new FileLoggerStrategy());
        logger.info("logger info 1");
        logger.error("logger error 1");
        logger.debug("logger debug 1");


        logger.setLoggerStrategy(new ErrorLoggerStrategy());
        logger.error("logger error 2");
        logger.error("logger error 3");
    }
}
