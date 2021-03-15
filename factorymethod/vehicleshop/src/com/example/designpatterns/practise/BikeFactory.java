package com.example.designpatterns.practise;

public class BikeFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}
