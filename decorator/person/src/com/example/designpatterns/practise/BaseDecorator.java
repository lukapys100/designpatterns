package com.example.designpatterns.practise;


//Base decorator for wrapping Person objects
abstract class BaseDecorator implements Human{
    private Human human;

    public BaseDecorator(Human human) {
        this.human = human;
    }

    @Override
    public void dressUp(Clothes clothes) {
        human.dressUp(clothes);
    }

    @Override
    public Clothes takeOf() {
        return human.takeOf();
    }
}
