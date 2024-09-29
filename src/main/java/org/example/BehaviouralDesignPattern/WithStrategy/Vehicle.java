package org.example.BehaviouralDesignPattern.WithStrategy;

import org.example.BehaviouralDesignPattern.WithStrategy.Drive.Drive;

public class Vehicle {
    Drive driveStrategy;
    Vehicle(Drive driveStrategy){
        driveStrategy.drive();
    }
}
