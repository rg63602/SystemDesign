package org.example.BehaviouralDesignPattern.WithStrategy;

import org.example.BehaviouralDesignPattern.WithStrategy.Drive.NULLDriveObject;

public class NULLVehicleObject extends Vehicle{
    NULLVehicleObject(){
        super(new NULLDriveObject());
    }
}
