package org.example.BehaviouralDesignPattern.WithStrategy;

import org.example.BehaviouralDesignPattern.WithStrategy.Drive.NormalDrive;

public class PassengerVehicle extends Vehicle{
    PassengerVehicle(){
        super(new NormalDrive());
    }
}
