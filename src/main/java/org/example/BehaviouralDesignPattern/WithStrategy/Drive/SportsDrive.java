package org.example.BehaviouralDesignPattern.WithStrategy.Drive;

public class SportsDrive implements Drive{
    @Override
    public void drive() {
        System.out.println("Sports Drive");
    }
}
