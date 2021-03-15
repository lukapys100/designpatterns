package com.example.designpatterns.practise.vehicles;

public class Bike implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("You have no engine... Just use your legs muscle :)");
        move();
        stop();
    }

    @Override
    public void move() {
        System.out.println("Go go go!!! It is a bike time :)");
    }

    @Override
    public void stop() {
        System.out.println("Your bike just stopped...");
    }
}
