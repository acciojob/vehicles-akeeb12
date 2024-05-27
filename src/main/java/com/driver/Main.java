package com.driver;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("General Vehicle", "Generic name");
        System.out.println("Vehicle Type: " + vehicle.getType());
        System.out.println("Vehicle Name: " + vehicle.getName());

        Car car = new Car("Sedan", "ToyotaName", "Toyota Corolla");
        System.out.println("Car Type: " + car.getType());
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Car Name: " + car.getName());

        F1 f1Car = new F1("Race Car", "FerrariName", "Ferrari F1", 350);
        System.out.println("F1 Car Type: " + f1Car.getType());
        System.out.println("F1 Car Model: " + f1Car.getModel());
        System.out.println("F1 Car Name: " + f1Car.getName());
        System.out.println("F1 Car Top Speed: " + f1Car.getTopSpeed() + " km/h");

        Boat boat = new Boat("Yacht", 20);
        System.out.println("Boat Name: " + boat.getVehicleName());
        System.out.println("Boat Capacity: " + boat.getVehicleCapacity() + " people");
    }
}
