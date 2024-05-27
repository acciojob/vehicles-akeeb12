package com.driver;

public class F1 extends Car {
    private int topSpeed;

    public F1(String type, String name, String model, int topSpeed) {
        super(type, name, model);
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public boolean isManual() {
        return true; // example value, adjust as needed
    }

    public void accelerate(int speed) {
        move(speed, getCurrentDirection());
    }
}
