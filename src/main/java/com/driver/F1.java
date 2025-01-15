package com.driver;

public class F1 extends Car {
   
    boolean isManual;
    
    public F1(String name, boolean isManual) {
        super(name);
        this.isManual = isManual;
    }

    @Override
    public boolean isManual() {
        return isManual; // example value, adjust as needed
    }

    public void accelerate(int rate) {

        int newSpeed = 0;
        int currentSpeed = super.getCurrentSpeed();
        newSpeed = rate+currentSpeed;

      if(newSpeed == 0){
        super.stop();
        super.changeGear(1);
      }else if(newSpeed > 0 && newSpeed <= 50){
        super.changeGear(1);
      }else if(newSpeed >= 51 && newSpeed <= 100){
        super.changeGear(2);
      }else if(newSpeed >= 101 && newSpeed <= 150){
        super.changeGear(3);
      }else if(newSpeed >= 151 && newSpeed <= 200){
        super.changeGear(4);
      }else if(newSpeed >= 201 && newSpeed <= 250){
        super.changeGear(5);
      }else{
        super.changeGear(6);
      }
      if(newSpeed > 0){
        changeSpeed(newSpeed, getCurrentDirection());
      }
    }
}
