package org.example.BehaviouralDesignPattern.WithStrategy;

import org.example.BehaviouralDesignPattern.WithStrategy.Drive.NormalDrive;

public class TruckVehicle extends Vehicle{
    TruckVehicle(){
        super(new NormalDrive());
    }
}
