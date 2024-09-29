package org.example;

import org.example.BehaviouralDesignPattern.NULLObjectPattern.Vehicle;
import org.example.BehaviouralDesignPattern.NULLObjectPattern.VehicleFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");
        String typeOfVehicle = "Bike";
        Vehicle vehicle = VehicleFactory.getVehicleObject(typeOfVehicle);
        System.out.println(vehicle.getFuelCapacity() + " " + vehicle.getTankCapacity());
    }
}