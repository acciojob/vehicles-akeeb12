package com.driver;

public class Main {
    public static void main(String[] args) {
        // Create an instance of Vehicle
        Vehicle vehicle = new Vehicle("General Vehicle");
        System.out.println("Vehicle Type: " + vehicle.getType());

        // Create an instance of Car
        Car car = new Car("Sedan", "Toyota Corolla");
        System.out.println("Car Type: " + car.getType());
        System.out.println("Car Model: " + car.getModel());

        // Create an instance of F1
        F1 f1Car = new F1("Race Car", "Ferrari F1", 350);
        System.out.println("F1 Car Type: " + f1Car.getType());
        System.out.println("F1 Car Model: " + f1Car.getModel());
        System.out.println("F1 Car Top Speed: " + f1Car.getTopSpeed() + " km/h");

        // Create an instance of Boat
        Boat boat = new Boat("Yacht", 20);
        System.out.println("Boat Name: " + boat.getVehicleName());
        System.out.println("Boat Capacity: " + boat.getVehicleCapacity() + " people");
    }
}
