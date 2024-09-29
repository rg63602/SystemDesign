package org.example.BehaviouralDesignPattern.WithStrategy;

import org.example.BehaviouralDesignPattern.WithStrategy.Drive.SportsDrive;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle(){
        super(new SportsDrive());
    }
}
