package org.example.BehaviouralDesignPattern.WithStrategy.Drive;

public class NULLDriveObject implements Drive{
    @Override
    public void drive() {
        System.out.println("No Drive Strategy Detected.");
    }
}
