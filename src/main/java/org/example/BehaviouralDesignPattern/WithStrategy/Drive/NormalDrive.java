package org.example.BehaviouralDesignPattern.WithStrategy.Drive;

public class NormalDrive implements Drive{
    @Override
    public void drive() {
        System.out.println("Normal Drive");
    }
}
