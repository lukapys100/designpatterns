package com.example.designpatterns.practise;

public class Plane implements Vehicle {
    private boolean isEveryEngineWorks;
    private boolean isEveryEngineOn;
    private int engines;

    public Plane() {
        this.engines = 4;
        this.isEveryEngineWorks = true;
    }

    @Override
    public void startEngine() {
        if(isEveryEngineWorks){
            for(int i=1; i<=this.engines; i++){
                System.out.println("Engine number " + i + " is starting...");
            }
            this.isEveryEngineOn = true;
        }
    }

    @Override
    public void move() {
        System.out.println("I believe I can fly... I believe I can touch the sky...");
    }

    @Override
    public void stop() {
        if(isEveryEngineOn){
            System.out.println("Be careful... We are landing...");
            for(int i=1; i<=this.engines; i++){
                System.out.println("Engine number " + i + " is stopping...");
            }
            this.isEveryEngineOn = false;
            System.out.println("We have stopped...");
        }
    }
}
