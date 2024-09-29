package org.example.BehaviouralDesignPattern.NULLObjectPattern;

public class NULLVehicleObject implements Vehicle{
    @Override
    public int getFuelCapacity(){
        return 0;
    }

    @Override
    public int getTankCapacity(){
        return 0;
    }
}
