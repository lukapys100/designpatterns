package com.example.designpatterns.practise;

public class CacheMain {

    public static void main(String[] args){
        WorkersCache cache = new WorkersCache();

        Worker worker1 = cache.get("Web manager");
        Worker worker2 = cache.get("PHP Developer");
        Worker worker3 = cache.get("PHP Developer");

        if(worker1 != worker2 && !worker1.equals(worker2)){
            System.out.println("Objects are different and that should be :)");
        }else{
            System.out.println("Objects are the same in some different way :(");
        }

        if(worker2 != worker3){
            System.out.println("We have two different objects...");
            if(worker2.equals(worker3)){
                System.out.println("And they are identical! Great news!");
            }else{
                System.out.println("But they are not identical! Bad news!");
            }
        }else{
            System.out.println("They are the same object... Something goes wrong :(");
        }
    }
}
