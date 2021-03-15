package com.example.designpatterns.practise.factories;

import com.example.designpatterns.practise.vehicles.Bike;
import com.example.designpatterns.practise.vehicles.Vehicle;

public class BikeFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}
