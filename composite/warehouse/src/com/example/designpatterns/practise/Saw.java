package com.example.designpatterns.practise;

public class Saw extends BasicComponent implements Tool{

    public Saw(int weight, int cost) {
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
        if(isHeld){
            System.out.println("Wrr, wrr, wrr... And wood is ready :)");
        }else{
            System.out.println("Let's hold the saw...");
            this.isHeld = true;
            use();
        }
    }
}
