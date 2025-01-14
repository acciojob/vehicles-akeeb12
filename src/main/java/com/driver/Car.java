package com.driver;

import java.rmi.server.SkeletonNotFoundException;


public class Car extends Vehicle {
    private String type;
    private String model;
    private int doors;
    private int gears;
    private int wheels;
    private boolean isManual;
    private int seats;
    private int currentGear;

    public Car(String type, String name, String model) {
        super(name, model);
        this.type = type;
        this.doors = 4; // example value, adjust as needed
        this.gears = 5; // example value, adjust as needed
        this.wheels = 4; // example value, adjust as needed
        this.isManual = isManual; // example value, adjust as needed
        this.seats = 5; // example value, adjust as needed
        this.currentGear = 1;
    }

    public void changeGear(int newGear){
        currentGear = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        move(newSpeed, newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }

    public Car(String type, String model) {
        super(type, model);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getSeats() {
        return seats;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public String getType() {
        return type;
    }
}
