package com.driver;

public class Main{
    public static void main(String[] args){
        
        Boat boat = new Boat("Titanic", 100);

        System.out.println("Boat Name:" +boat.getVehicleName());
        System.out.println("Boat Capacity:" + boat.getVehicleCapacity());

        boat.setName("Poseidon");
        boat.setCapacity(200);

        System.out.println("Boat Name(after change):" + boat.getVehicleName());
        System.out.println("Boat Capacity(after change):" + boat.getVehicleCapacity());

        
    }
}