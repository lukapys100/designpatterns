package com.example.designpatterns.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToolBox extends BasicComponent {

    protected List<BasicComponent> content = new ArrayList<>();

    public ToolBox(int weight, int cost, BasicComponent... basicComponents) {
        super(weight, cost);
        add(basicComponents);
    }

    public void add(BasicComponent basicComponent){
        content.add(basicComponent);
    }

    public void add(BasicComponent... basicComponents){
        content.addAll(Arrays.asList(basicComponents));
    }

    public void remove(BasicComponent basicComponent){
        content.remove(basicComponent);
    }

    public void remove(BasicComponent... basicComponents){
        content.removeAll(Arrays.asList(basicComponents));
    }

    public void clear(){
        content.clear();
    }

    @Override
    public int getCost() {
        int sum = this.cost;
        System.out.println("Current cost: " + sum);
        for(BasicComponent basicComponent : content){
            System.out.println("Adding " + basicComponent.getClass().getSimpleName() + " to the cost list...");
            sum+=basicComponent.getCost();
            System.out.println("Current cost: " + sum);
        }
        return sum;
    }

    @Override
    public int getWeight() {
        int sum = this.weight;
        System.out.println("Current weight: " + sum);
        for(BasicComponent basicComponent : content){
            System.out.println("Adding " + basicComponent.getClass().getSimpleName() + " to the weight list...");
            sum+=basicComponent.getWeight();
            System.out.println("Current weight: " + sum);
        }
        return sum;
    }
}