package org.example.DesignLogger;

public class ConsoleLoggerStrategy implements LoggerStrategy{
    @Override
    public void info(String message) {
        System.out.println("ConsoleLoggerStrategy - INFO :: " + message);
    }

    @Override
    public void error(String message) {
        System.out.println("ConsoleLoggerStrategy - ERROR :: " + message);
    }

    @Override
    public void debug(String message) {
        System.out.println("ConsoleLoggerStrategy - DEBUG :: " + message);
    }
}
