package com.example.designpatterns.practise.factories;

import com.example.designpatterns.practise.vehicles.Vehicle;

public abstract class VehicleFactory {

    public void initialize(){
        Vehicle vehicle = createVehicle();
        vehicle.startEngine();
    }

    public abstract Vehicle createVehicle();
}
