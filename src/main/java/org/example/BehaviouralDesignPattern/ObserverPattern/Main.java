package org.example.BehaviouralDesignPattern.ObserverPattern;

import org.example.BehaviouralDesignPattern.ObserverPattern.Observable.IphoneObservableImpl;
import org.example.BehaviouralDesignPattern.ObserverPattern.Observable.Observable;
import org.example.BehaviouralDesignPattern.ObserverPattern.Observer.EmailAlertObserverImpl;
import org.example.BehaviouralDesignPattern.ObserverPattern.Observer.Observer;
import org.example.BehaviouralDesignPattern.ObserverPattern.Observer.SMSAlertObserverImpl;

public class Main {
    public static void main(String[] args) {
        IphoneObservableImpl iphoneObservable = new IphoneObservableImpl();

        Observer userA = new EmailAlertObserverImpl("userA@gmail.com", iphoneObservable);
        Observer userB = new EmailAlertObserverImpl("userB@gmail.com", iphoneObservable);
        Observer userC = new SMSAlertObserverImpl("+91 1234567890", iphoneObservable);

        iphoneObservable.add(userA);
        iphoneObservable.add(userB);
        iphoneObservable.add(userC);

        iphoneObservable.setStock(100);
        iphoneObservable.setStock(0);
        iphoneObservable.setStock(10);
    }
}
