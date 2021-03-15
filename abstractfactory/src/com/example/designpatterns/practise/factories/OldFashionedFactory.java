package com.example.designpatterns.practise.factories;

import com.example.designpatterns.practise.furnitures.*;

public class OldFashionedFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new OldFashionedChair();
    }

    @Override
    public Table createTable() {
        return new OldFashionedTable();
    }

    @Override
    public Sofa createSofa() {
        return new OldFashionedSofa();
    }
}
