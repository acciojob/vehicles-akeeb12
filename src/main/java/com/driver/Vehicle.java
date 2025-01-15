package com.driver;

public class Vehicle {
    // private String type;
    private String name;
    private int currentSpeed;
    private int currentDirection;

    public String getName(){
        return name;
    }

    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }
    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void move(int speed, int direction) {
        currentSpeed = speed;
        currentDirection = direction;
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public void steer(int direction) {
       currentDirection = currentDirection + direction;
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void stop() {
        currentSpeed = 0;
        System.out.println("Stop method called - The vehicle is stopped");
    }
}
