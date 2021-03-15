package com.example.designpatterns.practise;

import com.example.designpatterns.practise.aplication.UserApplication;
import com.example.designpatterns.practise.factories.FurnitureFactory;
import com.example.designpatterns.practise.factories.ModernFactory;
import com.example.designpatterns.practise.factories.OldFashionedFactory;

import java.util.Scanner;

public class Main {

    private static UserApplication configure(){
        Scanner scanner = new Scanner(System.in);
        UserApplication userApplication = null;
        FurnitureFactory furnitureFactory;

        System.out.println("Choose type of furniture you want to test: ");
        String userPreference = scanner.nextLine().toLowerCase();

        if(userPreference.equals("modern")){
            furnitureFactory = new ModernFactory();
            userApplication = new UserApplication(furnitureFactory);
        }else if(userPreference.equals("old fashioned")){
            furnitureFactory = new OldFashionedFactory();
            userApplication = new UserApplication(furnitureFactory);
        }
        if(userApplication != null){
            return userApplication;
        }else{
            throw new NullPointerException();
        }
    }

    public static void main(String[] args) {
        UserApplication userApplication = configure();
        userApplication.doSomethingWithChair();
        userApplication.doSomethingWithTable();
        userApplication.doSomethingWithSofa();
    }
}
