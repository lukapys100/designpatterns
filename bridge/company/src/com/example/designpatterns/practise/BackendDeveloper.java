package com.example.designpatterns.practise;

public class BackendDeveloper implements Worker {

    private boolean isAvailable = false;
    private boolean isBreakAvailable = true;
    private String breakfast;

    public BackendDeveloper() {
    }


    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public void startWork(int hours) {
        if(isAvailable){
            System.out.println("I am working right now...");
        }else{
            isAvailable = true;
        }
    }

    @Override
    public void takeBreak() {
        if(isBreakAvailable){
            System.out.println("Time for a break!");
        }else{
            System.out.println("I have no break :(");
        }
    }

    @Override
    public void setBreak(boolean isNextBreak) {
        if(isNextBreak){
            this.isBreakAvailable = true;
        }
    }

    @Override
    public void finishWork() {
        if(!isAvailable){
            System.out.println("I am not working yet...");
        }else{
            this.isAvailable = false;
            System.out.println("Is it end of the work?");
        }
    }
}
