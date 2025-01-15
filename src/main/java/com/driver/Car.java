package com.driver;

public class Car extends Vehicle {
    private String type;
    private String model;
    private final int doors;
    private int gears;
    private int wheels;
    private boolean manual;
    private int seats;
    private int currentGear;

    public Car(String type, String name, String model) {
        super(name, model);
        this.model = model;
        this.type = type;
        this.doors = 4; // example value, adjust as needed
        this.gears = 5; // example value, adjust as needed
        this.wheels = 4; // example value, adjust as needed
        this.manual = true; // example value, adjust as needed
        this.seats = 5; // example value, adjust as needed
        this.currentGear = 1;
    }

    public Car(int doors, String type, String model) {
        super(type, model);
        this.doors = doors;
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
        return manual;
    }

    public int getSeats() {
        return seats;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void changeSpeed(int speed, int direction) {
        move(speed, direction);
    }

    public void changeGear(int gear) {
        this.currentGear = gear;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
