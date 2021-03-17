package com.example.designpatterns.practise;

public class RealHouse {
    private BuildingType buildingType;
    private int windows;
    private int doors;
    private Garden garden;
    private SwimmingPool swimmingPool;

    public RealHouse(BuildingType buildingType, int windows, int doors, Garden garden, SwimmingPool swimmingPool) {
        this.buildingType = buildingType;
        this.windows = windows;
        this.doors = doors;
        this.garden = garden;
        this.swimmingPool = swimmingPool;
    }

    public BuildingType getBuildingType() {
        return buildingType;
    }

    public int getWindows() {
        return windows;
    }

    public int getDoors() {
        return doors;
    }

    public Garden getGarden() {
        return garden;
    }

    public SwimmingPool getSwimmingPool() {
        return swimmingPool;
    }
}
