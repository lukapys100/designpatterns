package com.example.designpatterns.practise;

public class ToyHouse {

    private BuildingType buildingType;
    private int windows;
    private int doors;
    private Garden garden;
    private SwimmingPool swimmingPool;

    public ToyHouse(BuildingType buildingType, int windows, int doors, Garden garden, SwimmingPool swimmingPool) {
        this.buildingType = buildingType;
        this.windows = windows;
        this.doors = doors;
        this.garden = garden;
        this.swimmingPool = swimmingPool;
    }

    public String printInformation(){
        String info = "Building type: " + buildingType + "\n";
        info+="Number of windows: " + windows + "\n";
        info+="Number of doors: " + doors + "\n";
        if(garden != null){
            info+="Garden info: " + garden.toString() + "\n";
        }
        if(swimmingPool != null){
            info+="Swimming pool info: " + swimmingPool.toString() + "\n";
        }
        return info;
    }
}
