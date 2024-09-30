package org.example.DesignLogger;


/**
 * @author rishabhkumargupta
 * @implNote - Different logger Strategy for consoling on screens, stores logs into file, consoles only errors etc.
 */
public interface LoggerStrategy {
    void info(String message);
    void error(String message);
    void debug(String message);
}
