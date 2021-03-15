package com.example.designpatterns.practise.factories;

import com.example.designpatterns.practise.vehicles.Plane;
import com.example.designpatterns.practise.vehicles.Vehicle;

public class PlaneFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Plane();
    }
}
