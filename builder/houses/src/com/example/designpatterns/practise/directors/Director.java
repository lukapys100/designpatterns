package com.example.designpatterns.practise.directors;

import com.example.designpatterns.practise.builders.Builder;
import com.example.designpatterns.practise.resultsfeatures.BuildingType;
import com.example.designpatterns.practise.resultsfeatures.Garden;
import com.example.designpatterns.practise.resultsfeatures.SwimmingPool;

public class Director {

    public void constructCommonHouse(Builder builder){
        builder.setBuildingType(BuildingType.COMMON_HOUSE);
        builder.setDoors(2);
        builder.setWindows(10);
    }

    public void constructSkyscraper(Builder builder){
        builder.setBuildingType(BuildingType.SKYSCRAPER);
        builder.setDoors(5);
        builder.setWindows(300);
        builder.setGarden(new Garden(1000, 2000));
        builder.setSwimmingPool(new SwimmingPool(100, 200, 5));
    }

    public void constructCastle(Builder builder){
        builder.setBuildingType(BuildingType.CASTLE);
        builder.setDoors(1);
        builder.setWindows(50);
        builder.setGarden(new Garden(5000, 4000));
    }
}
