package org.example.BehaviouralDesignPattern.NULLObjectPattern;

public class Car implements Vehicle{
    @Override
    public int getFuelCapacity(){
        return 10;
    }

    @Override
    public int getTankCapacity(){
        return 20;
    }
}
