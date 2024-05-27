package com.driver;

public class F1 extends Car {
    private int speed;

    public F1(String type, String name, String model, int topSpeed) {
        super(type, name, model);
        this.speed = speed;
    }

    public int getTopSpeed() {
        return speed;
    }

    public void setTopSpeed(int topSpeed) {
        this.speed = topSpeed;
    }

    public boolean isManual() {
        return true; // example value, adjust as needed
    }

    public void accelerate(int speed) {
        move(speed, getCurrentDirection());
    }
}
