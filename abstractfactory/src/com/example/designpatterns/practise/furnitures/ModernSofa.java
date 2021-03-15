package com.example.designpatterns.practise.furnitures;

public class ModernSofa implements Sofa {
    @Override
    public void paint() {
        System.out.println("Just wonder which colour is your favourite :)");
    }

    @Override
    public void doSomething() {
        System.out.println("Nothing has been done...");
    }
}
