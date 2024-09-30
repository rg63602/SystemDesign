package org.example.DesignLogger;

public class Logger {
    static Logger logger;
    LoggerStrategy loggerStrategy;

    private Logger(){
        this.loggerStrategy = new ConsoleLoggerStrategy();
    }

    /**
     * Singleton Design Pattern to ensure only one instance must be created.
     * @return Logger object
     */
    public static Logger getInstance(){
        if(logger == null){
            return new Logger();
        }
        return logger;
    }

    public void info(String message){
        loggerStrategy.info(message);
    }

    public void error(String message){
        loggerStrategy.error(message);
    }

    public void debug(String message){
        loggerStrategy.debug(message);
    }

    public void setLoggerStrategy(LoggerStrategy loggerStrategy){
        this.loggerStrategy = loggerStrategy;
    }
}
