package com.example.designpatterns.practise;

public class ToyHouseBuilder implements Builder {

    private BuildingType buildingType;
    private int windows;
    private int doors;
    private Garden garden;
    private SwimmingPool swimmingPool;

    @Override
    public void setBuildingType(BuildingType buildingType) {
        this.buildingType = buildingType;
    }

    @Override
    public void setWindows(int windows) {
        this.windows = windows;
    }

    @Override
    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public void setGarden(Garden garden) {
        this.garden = garden;
    }

    @Override
    public void setSwimmingPool(SwimmingPool swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public ToyHouse getResult(){
        return new ToyHouse(buildingType, windows, doors, garden, swimmingPool);
    }
}
