package com.example.designpatterns.practise;

public class Main {

    public static void main(String[] args) {
	    RealHouseBuilder realHouseBuilder = new RealHouseBuilder();
	    ToyHouseBuilder toyHouseBuilder = new ToyHouseBuilder();
	    Director director = new Director();

	    director.constructCastle(realHouseBuilder);
	    director.constructCastle(toyHouseBuilder);

	    RealHouse realHouse = realHouseBuilder.getResult();
	    ToyHouse toyHouse = toyHouseBuilder.getResult();
		System.out.println(toyHouse.printInformation());

		director.constructSkyscraper(toyHouseBuilder);
		toyHouse = toyHouseBuilder.getResult();
		System.out.println(toyHouse.printInformation());
    }
}
