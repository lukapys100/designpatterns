package com.example.designpatterns.practise.builders;

import com.example.designpatterns.practise.resultsfeatures.BuildingType;
import com.example.designpatterns.practise.resultsfeatures.Garden;
import com.example.designpatterns.practise.resultsfeatures.SwimmingPool;

public interface Builder {
    void setBuildingType(BuildingType buildingType);
    void setWindows(int windows);
    void setDoors(int doors);
    void setGarden(Garden garden);
    void setSwimmingPool(SwimmingPool swimmingPool);
}
