package com.example.designpatterns.practise;

//Base decorator for Tank class
public class TankDecorator implements WarMachine{
    private WarMachine warMachine;

    public TankDecorator(WarMachine warMachine) {
        this.warMachine = warMachine;
    }

    @Override
    public void arm() {
        warMachine.arm();
    }

    @Override
    public void aim(int x, int y) {
        warMachine.aim(x,y);
    }

    @Override
    public void shoot() {
        warMachine.shoot();
    }

    @Override
    public void reload() {
        warMachine.reload();
    }
}
