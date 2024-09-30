package org.example.DesignLogger;

public class FileLoggerStrategy implements LoggerStrategy{
    String path;

    @Override
    public void info(String message) {
        System.out.println("FileLoggerStrategy - INFO :: " + message);
    }

    @Override
    public void error(String message) {
        System.out.println("FileLoggerStrategy - ERROR :: " + message);
    }

    @Override
    public void debug(String message) {
        System.out.println("FileLoggerStrategy - DEBUG :: " + message);
    }
    public void logToFile(String message){
        System.out.println("Logging to file on " + path + "....");
        // write logic to save into file
    }
}
