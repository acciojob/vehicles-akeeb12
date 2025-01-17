package com.driver;

public class Vehicle {
    protected String name;
    protected int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return this.name;
    }

    public int getSpeed() {
        return this.speed;
    }
}