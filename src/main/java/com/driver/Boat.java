package com.driver;

    public class Boat implements WaterVehicle {
        private final String name;
        private final int capacity;

        // Constructor that requires name and capacity arguments
        public Boat(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        // Implementation of getVehicleName method from WaterVehicle interface
        @Override
        public String getVehicleName() {
            return name;
        }

        // Implementation of getVehicleCapacity method from WaterVehicle interface
        @Override
        public int getVehicleCapacity() {
            return capacity;
        }
    }


