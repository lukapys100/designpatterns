package com.example.designpatterns.practise;

abstract class BasicComponent implements Component{
    protected int weight;
    protected int cost;
    protected boolean isHeld;

    public BasicComponent(int weight, int cost) {
        this.weight = weight;
        this.cost = cost;
    }

    @Override
    public int getCost() {
        return 0;
    }

    @Override
    public int getWeight() {
        return 0;
    }

    @Override
    public void hold() {
        this.isHeld = true;
    }

    @Override
    public void move() {
        if(isHeld){
            System.out.println("If you hold it yet, move it somewhere...");
        }else{
            System.out.println("First of all you need to take it :)");
        }
    }

    @Override
    public void put() {
        this.isHeld = false;
    }
}
