package com.driver;

public class Car extends Vehicle {
    private String model;

    public Car(String type, String model) {
        super(type);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
