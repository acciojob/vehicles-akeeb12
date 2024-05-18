package com.driver;

public class F1 extends Car {
    private int topSpeed;

    public F1(String type, String model, int topSpeed) {
        super(type, model);
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getCurrentSpeed()
    {
        return super.getCurrentSpeed();
    }
}
