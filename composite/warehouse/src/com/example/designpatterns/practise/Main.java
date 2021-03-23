package com.example.designpatterns.practise;

public class Main {

    public static void main(String[] args) {
        //Creating client's object
	    WarehouseApplication application = new WarehouseApplication(200, 100);

	    //Crating boxes for storing boxes and tools
        ToolBox toolBox1 = new ToolBox(100, 80);
        ToolBox toolBox2 = new ToolBox(70, 60);
        ToolBox toolBox3 = new ToolBox(50, 50);
        ToolBox toolBox4 = new ToolBox(20, 30);
        ToolBox toolBox5 = new ToolBox(10, 20);

        //Creating tools for storing in boxes
        Drill drill1 = new Drill(100, 500);
        Drill drill2 = new Drill(150, 700);
        Drill drill3 = new Drill(200, 1000);

        Hammer hammer1 = new Hammer(70, 150);
        Hammer hammer2 = new Hammer(100, 170);
        Hammer hammer3 = new Hammer(50, 100);
        Hammer hammer4 = new Hammer(30, 80);

        Saw saw1 = new Saw(20,100);
        Saw saw2 = new Saw(200,2000);
        Saw saw3 = new Saw(40,300);
        Saw saw4 = new Saw(100,500);
        Saw saw5 = new Saw(50,150);

        //Making order with composite
        toolBox1.add(toolBox2, toolBox3, hammer2, saw2);
        toolBox2.add(toolBox4, drill1, drill2);
        toolBox3.add(drill3);
        toolBox4.add(toolBox5, hammer1, hammer3, saw1);
        toolBox5.add(hammer4, saw3, saw4, saw5);

        //Adding everything to the Application
        application.doOrder(toolBox1);

        //Checking entire cost and entire wight
        System.out.println("Total cost: " + application.getTotalCost());
        System.out.println("Total weight: " + application.getTotalWeight());
    }
}
