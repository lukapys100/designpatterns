package com.example.designpatterns.practise;


//Interface for Tank and Tank decorator
public interface WarMachine {
    void arm();
    void aim(int x, int y);
    void shoot();
    void reload();
}
