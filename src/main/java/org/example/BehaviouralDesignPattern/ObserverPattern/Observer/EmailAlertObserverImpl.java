package org.example.BehaviouralDesignPattern.ObserverPattern.Observer;

import org.example.BehaviouralDesignPattern.ObserverPattern.Observable.Observable;

public class EmailAlertObserverImpl implements Observer{
    String email;
    Observable observable;

    public EmailAlertObserverImpl(String email, Observable observable) {
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("Sent mail to email : " + email);
        // write actual logic to send mail
    }
}
