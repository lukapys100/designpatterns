package com.example.designpatterns.practise;

public interface Worker {

    boolean isAvailable();

    void startWork(int hours);

    void takeBreak();

    void setBreak(boolean isNextBreak);

    void finishWork();

}
