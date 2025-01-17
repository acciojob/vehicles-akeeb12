package com.driver;

public class Car extends Vehicle {
    private final int numOfWheels;

    public Car(String name, int speed, int numOfWheels) {
        super(name, speed);
        this.numOfWheels = numOfWheels;
    }

    public int getNumOfWheels() {
        return this.numOfWheels;
    }
}