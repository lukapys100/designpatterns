package com.example.designpatterns.practise;


//Specified plain class
public class Tank implements WarMachine{
    private boolean isArmed = false;
    private int currentCrosshairPositionX;
    private int currentCrosshairPositionY;
    private final int TANK_ACCURACY_OVERSHOOT = 10;

    public Tank() {
    }

    @Override
    public void arm() {
        this.isArmed = true;
        System.out.println("Tank is ready to shoot now!");
    }

    @Override
    public void aim(int x, int y) {
        if(x>=0 && y>=0){
            currentCrosshairPositionX = x+100;
            currentCrosshairPositionY = y+100;
            while(currentCrosshairPositionX >= x+TANK_ACCURACY_OVERSHOOT
                    && currentCrosshairPositionY >= y+TANK_ACCURACY_OVERSHOOT){
                currentCrosshairPositionX -= 1;
                currentCrosshairPositionY -= 1;
            }
        }
    }

    @Override
    public void shoot() {
        if(isArmed){
            System.out.println("SHOT!");
            reload();
        }
    }

    @Override
    public void reload() {
        System.out.println("Reload...");
    }
}
