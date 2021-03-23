package com.example.designpatterns.practise;

public class Hammer extends BasicComponent implements Tool {

    public Hammer(int weight, int cost) {
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

    @Override
    public void use() {
        if(this.isHeld){
            System.out.println("Bam bam bam");
        }else {
            System.out.println("To use this item you need to take if at first...");
        }
    }
}
