package com.driver;

public class Car extends Vehicle {
    private String type;
    private String model;
    private int doors;
    private int gears;
    private int wheels;
    private boolean isManual;
    private int seats;
    private int currentGear;

    public Car(String type, String name, int wheels, int gears,int doors, boolean isManual,int seats) {
        super(name);
        this.model = model;
        this.type = type;
        this.doors = 4; // example value, adjust as needed
        this.gears = 5; // example value, adjust as needed
        this.wheels = 4; // example value, adjust as needed
        this.isManual = isManual; // example value, adjust as needed
        this.seats = 5; // example value, adjust as needed
        this.currentGear = 1;
    }

    public Car(String name) {
        super(name);
    }

    public String getModel() {
        return model;
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

    public void changeSpeed(int newSpeed, int newDirection) {
        super.move(newSpeed, newDirection);
        System.out.println("changeSpeed method called - the speed is changes to:" + newSpeed + ", and the direction is changes to:" + newDirection + "degrees");
    }

    public void changeGear(int newGear) {
        this.currentGear = newGear;
        System.out.println("gear changes to: " + currentGear);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
