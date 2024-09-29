package org.example.BehaviouralDesignPattern.WithStrategy;

public class VehicleFactory {
    public static Vehicle getVehicleObject(String typeOfVehicle){
        return switch (typeOfVehicle) {
            case "Sports" -> new SportsVehicle();
            case "Truck" -> new TruckVehicle();
            case "Passenger" -> new PassengerVehicle();
            case "OffRoad" -> new OffRoadVehicle();
            default -> new NULLVehicleObject();
        };
    }
}
