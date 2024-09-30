package org.example.BehaviouralDesignPattern.ObserverPattern.Observer;

import org.example.BehaviouralDesignPattern.ObserverPattern.Observable.Observable;

public class SMSAlertObserverImpl implements Observer{
    Observable observable;
    String phoneNo;

    public SMSAlertObserverImpl(String phoneNo, Observable observable) {
        this.observable = observable;
        this.phoneNo = phoneNo;
    }

    @Override
    public void update() {
        System.out.println("Sent SMS to " + phoneNo);
    }
}
