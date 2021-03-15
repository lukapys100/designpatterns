package com.example.designpatterns.practise.furnitures;

public class ModernChair implements Chair {

    @Override
    public void move() {
        System.out.println("It can't move...");
    }

    @Override
    public void makeSound() {
        System.out.println("Some sound may be heard...");
    }
}
