package com.example.designpatterns.practise.factories;

import com.example.designpatterns.practise.vehicles.Car;
import com.example.designpatterns.practise.vehicles.Vehicle;

public class CarFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
