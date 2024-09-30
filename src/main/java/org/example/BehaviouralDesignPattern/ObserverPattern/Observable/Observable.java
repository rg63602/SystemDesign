package org.example.BehaviouralDesignPattern.ObserverPattern.Observable;

import org.example.BehaviouralDesignPattern.ObserverPattern.Observer.Observer;

public interface Observable {
    void add(Observer observer);
    void remove(Observer observer);
    void alert();
}
