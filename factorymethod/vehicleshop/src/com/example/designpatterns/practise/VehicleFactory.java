package com.example.designpatterns.practise;

public abstract class VehicleFactory {

    public void initialize(){
        Vehicle vehicle = createVehicle();
        vehicle.startEngine();
    }

    public abstract Vehicle createVehicle();
}
