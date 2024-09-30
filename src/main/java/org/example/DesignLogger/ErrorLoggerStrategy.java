package org.example.DesignLogger;

public class ErrorLoggerStrategy implements LoggerStrategy{
    @Override
    public void info(String message) {
        // optional skip
    }

    @Override
    public void error(String message) {
        System.out.println("ErrorLoggerStrategy - ERROR :: " + message);
    }

    @Override
    public void debug(String message) {
        // skip optional
    }
}
