package com.example.designpatterns.practise;


//Client code
public class Main {

    public static void main(String[] args) {
	    BaseDecorator baseDecorator = new WaterproofPersonDecorator(new Person());
	    Clothes clothes = new Clothes(10);
	    clothes.add("Shoes");
	    clothes.add("Dress");
	    baseDecorator.dressUp(clothes);
	    clothes.printAll();

        System.out.println();
	    baseDecorator.takeOf();
	    clothes.printAll();
        System.out.println();

	    clothes.add("Pants");
	    clothes.add("Mask");
	    clothes.add("Trousers");
	    clothes.add("T-shirt");
	    clothes.add("Sweater");
	    baseDecorator = new WinterPersonDecorator(new Person());
	    baseDecorator.dressUp(clothes);
	    clothes.printAll();
    }
}
