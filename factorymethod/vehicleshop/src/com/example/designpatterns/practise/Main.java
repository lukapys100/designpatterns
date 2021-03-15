package com.example.designpatterns.practise;

import com.example.designpatterns.practise.factories.BikeFactory;
import com.example.designpatterns.practise.factories.CarFactory;
import com.example.designpatterns.practise.factories.PlaneFactory;
import com.example.designpatterns.practise.factories.VehicleFactory;

import java.util.Scanner;

public class Main {
    private static VehicleFactory vehicleFactory;
    private static Scanner scanner;

    public static void main(String[] args) {
        configure();
        startLogic();
    }

    static void configure(){
        String choice;
        scanner = new Scanner(System.in);
        System.out.println("Choose the vehicle you want to use: ");
        choice = scanner.nextLine();
        switch(choice){
            case "car":
                vehicleFactory = new CarFactory();
                break;

            case "bike":
                vehicleFactory  = new BikeFactory();
                break;

            case "plane":
                vehicleFactory = new PlaneFactory();
                break;

            default:
                throw new IllegalArgumentException("There is no " + choice + " vehicle.");
        }
    }

    static void startLogic(){
        vehicleFactory.initialize();
    }
}
