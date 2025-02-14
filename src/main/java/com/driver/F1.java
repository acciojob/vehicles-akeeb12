package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        this.setName(name);
        this.setManual(isManual);
    }

    public void accelerate(int rate){
//        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate

        int newSpeed = getCurrentSpeed() + rate;
//        setCurrentSpeed(newSpeed);

        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            setCurrentSpeed(0);
            changeGear(1);
        }

        //for all other cases, change the gear accordingly
        if(newSpeed >=1 && newSpeed <=50){
            changeGear(1);
        } else if (newSpeed >= 51 && newSpeed <= 100) {
            changeGear(2);
        } else if (newSpeed >= 101 && newSpeed <= 150) {
            changeGear(3);
        } else if (newSpeed >= 151 && newSpeed <= 200) {
            changeGear(4);
        } else if (newSpeed >= 201 && newSpeed <= 250) {
            changeGear(5);
        } else if (newSpeed > 250) {
            changeGear(6);
        }

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}