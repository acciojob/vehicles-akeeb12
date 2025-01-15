package com.driver.test;

import com.driver.Vehicle;
import org.junit.Assert;
import org.junit.Test;

public class TestCases {
    @Test
    public void testVehicleType() {
        Vehicle vehicle = new Vehicle("Car", "Model X");
        Assert.assertEquals("Car", vehicle.getType());
    }

    @Test
    public void testVehicleName() {
        Vehicle vehicle = new Vehicle("Car", "Model X");
        Assert.assertEquals("Model X", vehicle.getName());
    }
}