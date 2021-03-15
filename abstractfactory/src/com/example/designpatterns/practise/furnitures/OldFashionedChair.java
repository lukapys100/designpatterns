package com.example.designpatterns.practise.furnitures;

public class OldFashionedChair implements Chair {
    @Override
    public void move() {
        System.out.println("It tries to move but it cant...");
    }

    @Override
    public void makeSound() {
        System.out.println("Nothing is heard");
    }
}
