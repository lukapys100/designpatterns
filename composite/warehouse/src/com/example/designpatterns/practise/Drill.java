package com.example.designpatterns.practise;

public class Drill extends BasicComponent implements Tool {

    private boolean isOn = false;

    public Drill(int weight, int cost) {
        super(weight, cost);
    }

    @Override
    public int getCost() {
        return this.cost;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    public boolean isOn() {
        return isOn;
    }

    public void switchOn(){
        System.out.println("Drill is switching on...");
        this.isOn = true;
    }

    public void switchOff(){
        System.out.println("Drill is switching off...");
        this.isOn = false;
    }

    @Override
    public void use() {
        hold();
        switchOn();
        System.out.println("Drill has been used... ");
        switchOff();
    }
}
