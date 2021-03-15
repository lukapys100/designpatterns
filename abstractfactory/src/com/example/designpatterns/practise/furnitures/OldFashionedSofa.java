package com.example.designpatterns.practise.furnitures;

public class OldFashionedSofa implements Sofa {
    @Override
    public void paint() {
        System.out.println("Hmm, that sofa exists only in one colour...");
    }

    @Override
    public void doSomething() {
        System.out.println("What should be done?");
    }
}
