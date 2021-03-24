package com.example.designpatterns.practise;

public class WinterPersonDecorator extends BaseDecorator {

    public WinterPersonDecorator(Human human) {
        super(human);
    }

    @Override
    public void dressUp(Clothes clothes) {
        super.dressUp(addWinterSet(clothes));
    }

    @Override
    public Clothes takeOf() {
        return super.takeOf();
    }

    public Clothes addWinterSet(Clothes clothes){
        clothes.add("Hat");
        clothes.add("Scarf");
        clothes.add("Jacket");
        clothes.add("Boots");
        return clothes;
    }
}
