package com.driver;

public class Car extends Vehicle {
    private String model;
    private int currentSpeed;


    public Car(String type, String model) {
        super(type);
        this.model = model;
        this.currentSpeed = 0;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public int getCurrentSpeed()
    {
        return currentSpeed;
    }
    public void setCurrentSpeed(int currentSpeed)
    {
        this.currentSpeed = currentSpeed;
    }
}
