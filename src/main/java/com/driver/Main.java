package com.driver;

public class Main {
    public static void main(String[] args) {
        // Create an instance of Vehicle
        Vehicle vehicle = new Vehicle("General Vehicle","Generic name");
        System.out.println("Vehicle Type: " + vehicle.getType());
        System.out.println("Vehicle Name: " + vehicle.getName());


        // Create an instance of Car
        Car car = new Car("Sedan", "ToyotaName","Toyota Corolla");
//        car.setCurrentSpeed(100); // Set the current speed
        System.out.println("Car Type: " + car.getType());
        System.out.println("Car Model: " + car.getModel());
        System.out.println(("Car Name:" + car.getName()));

        // Create an instance of F1
        F1 f1Car = new F1("Race Car","FerrariName", "Ferrari F1", 350);
//        f1Car.setCurrentSpeed(200); // Set the current speed
        System.out.println("F1 Car Type: " + f1Car.getType());
        System.out.println("F1 Car Model: " + f1Car.getModel());
        System.out.println("F1 Car Name: " + f1Car.getName());
        System.out.println("F1 Car Top Speed: " + f1Car.getTopSpeed() + " km/h");

        // Create an instance of Boat
        Boat boat = new Boat("Yacht", 20);
        System.out.println("Boat Name: " + boat.getVehicleName());
        System.out.println("Boat Capacity: " + boat.getVehicleCapacity() + " people");
    }
}
