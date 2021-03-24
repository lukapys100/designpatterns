package com.example.designpatterns.practise;

import java.util.ArrayList;
import java.util.List;

public class Clothes {
    private List<String> wearingClothes;
    private int cost;

    public Clothes(int cost) {
        this.wearingClothes = new ArrayList<>();
        this.cost = cost;
    }

    public void add(String name){
        wearingClothes.add(name);
    }

    public void remove(String name){
        wearingClothes.remove(name);
    }

    public void removeAll(){
        wearingClothes.clear();
    }

    public String get(String name){
        for(String n : wearingClothes){
            if(n.equals(name)){
                return name;
            }
        }
        return "Name: " + name + " does not exist.";
    }

    public int getCost() {
        return cost;
    }
}
