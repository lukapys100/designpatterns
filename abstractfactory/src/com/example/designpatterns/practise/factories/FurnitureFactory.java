package com.example.designpatterns.practise.factories;

import com.example.designpatterns.practise.furnitures.Chair;
import com.example.designpatterns.practise.furnitures.Sofa;
import com.example.designpatterns.practise.furnitures.Table;

public interface FurnitureFactory {
    Chair createChair();
    Table createTable();
    Sofa createSofa();
}
