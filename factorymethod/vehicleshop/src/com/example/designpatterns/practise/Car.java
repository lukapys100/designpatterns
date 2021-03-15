package com.example.designpatterns.practise;

public class Car implements Vehicle{
    private boolean isOn;

    @Override
    public void startEngine() {
        if(!isOn){
            System.out.println("Let's the car starts...");
            this.isOn = true;
        }
        move();
        stop();
    }

    @Override
    public void move() {
        if(isOn){
            System.out.println("It's time to drive!");
        }
    }

    @Override
    public void stop() {
        if(isOn){
            System.out.println("You have stopped... Engine is automatically shout down...");
            this.isOn = false;
        }
    }
}
