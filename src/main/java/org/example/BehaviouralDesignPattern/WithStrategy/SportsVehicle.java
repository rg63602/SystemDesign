package org.example.BehaviouralDesignPattern.WithStrategy;

import org.example.BehaviouralDesignPattern.WithStrategy.Drive.NormalDrive;
import org.example.BehaviouralDesignPattern.WithStrategy.Drive.SportsDrive;

public class SportsVehicle extends Vehicle{
    SportsVehicle(){
        super(new SportsDrive());
    }
}
