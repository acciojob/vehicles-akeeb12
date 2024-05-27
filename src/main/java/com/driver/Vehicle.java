package com.driver;

public class Vehicle {
    private String type;
    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String type, String name) {
        this.type = type;
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void move(int speed, int direction) {
        this.currentSpeed = speed;
        this.currentDirection = direction;
    }

    public void steer(int direction) {
        this.currentDirection = direction;
    }

    public void stop() {
        this.currentSpeed = 0;
    }
}
