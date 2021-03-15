package com.example.designpatterns.practise.aplication;

import com.example.designpatterns.practise.factories.FurnitureFactory;
import com.example.designpatterns.practise.furnitures.Chair;
import com.example.designpatterns.practise.furnitures.Sofa;
import com.example.designpatterns.practise.furnitures.Table;

public class UserApplication {
    private Chair chair;
    private Table table;
    private Sofa sofa;

    public UserApplication(FurnitureFactory furnitureFactory) {
        this.chair = furnitureFactory.createChair();
        this.table = furnitureFactory.createTable();
        this.sofa = furnitureFactory.createSofa();
    }

    public void doSomethingWithChair(){
        chair.move();
        chair.makeSound();
    }

    public void doSomethingWithTable(){
        table.breakDown();
    }

    public void doSomethingWithSofa(){
        sofa.paint();
        sofa.doSomething();
    }

}
