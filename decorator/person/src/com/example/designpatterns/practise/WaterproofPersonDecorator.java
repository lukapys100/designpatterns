package com.example.designpatterns.practise;


//One of person decorator
public class WaterproofPersonDecorator extends BaseDecorator{

    public WaterproofPersonDecorator(Human human) {
        super(human);
    }

    @Override
    public void dressUp(Clothes clothes) {
        super.dressUp(addWaterproofSet(clothes));
    }

    @Override
    public Clothes takeOf() {
        return super.takeOf();
    }

    public Clothes addWaterproofSet(Clothes clothes){
        clothes.add("Umbrella");
        clothes.add("Hat");
        clothes.add("Scarf");
        clothes.add("Jacket");
        return clothes;
    }
}
