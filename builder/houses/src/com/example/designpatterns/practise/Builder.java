package com.example.designpatterns.practise;

public interface Builder {
    void setBuildingType(BuildingType buildingType);
    void setWindows(int windows);
    void setDoors(int doors);
    void setGarden(Garden garden);
    void setSwimmingPool(SwimmingPool swimmingPool);
}
