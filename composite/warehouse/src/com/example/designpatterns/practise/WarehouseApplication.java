package com.example.designpatterns.practise;

public class WarehouseApplication {

    private ToolBox bigToolBox;

    public WarehouseApplication(int toolBoxWeight, int toolBoxCost) {
        bigToolBox = new ToolBox(toolBoxWeight, toolBoxCost);
    }

    public void doOrder(BasicComponent... basicComponents){
        System.out.println("Doing order with big tool box...");
        bigToolBox.clear();
        bigToolBox.add(basicComponents);
    }

    public int getTotalCost(){
        return bigToolBox.getCost();
    }

    public int getTotalWeight(){
        return bigToolBox.getWeight();
    }

}
