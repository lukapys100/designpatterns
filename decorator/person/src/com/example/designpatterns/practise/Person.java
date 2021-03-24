package com.example.designpatterns.practise;


//Plain class
public class Person implements Human{

    private Clothes wearingClothes;

    @Override
    public void dressUp(Clothes clothes) {
        wearingClothes = clothes;
    }

    @Override
    public Clothes takeOf() {
        wearingClothes.removeAll();
        return wearingClothes;
    }
}
