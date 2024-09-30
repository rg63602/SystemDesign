package org.example.BehaviouralDesignPattern.ObserverPattern.Observable;

import org.example.BehaviouralDesignPattern.ObserverPattern.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements Observable {
    int stock = 0;
    List<Observer> observerList = new ArrayList<>();


    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void alert() {
        for(Observer observer : observerList){
            observer.update();
        }
    }

    public void setStock(int stock){
        if(this.stock == 0){
            alert();
        }
        this.stock = stock;
        System.out.println("setStock :: Stock Set to : " + this.stock);
    }
}
