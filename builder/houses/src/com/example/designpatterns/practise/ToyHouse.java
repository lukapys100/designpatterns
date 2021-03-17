package com.example.designpatterns.practise;

public class ToyHouse {

    private BuildingType buildingType;
    private int window;
    private int doors;
    private Garden garden;
    private SwimmingPool swimmingPool;

    public ToyHouse(BuildingType buildingType, int window, int doors, Garden garden, SwimmingPool swimmingPool) {
        this.buildingType = buildingType;
        this.window = window;
        this.doors = doors;
        this.garden = garden;
        this.swimmingPool = swimmingPool;
    }

    public void printInformation(){
        String info = buildingType.toString() + "\n";
        info+=window + "\n";
        info+=doors + "\n";
        info+=garden.toString();
        info+=swimmingPool.toString();
    }
}
