package com.driver;

public class Car extends Vehicle {
    private String model;
    private int currentSpeed;


    public Car(String type, String name, String model) {
        super(type, name);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
