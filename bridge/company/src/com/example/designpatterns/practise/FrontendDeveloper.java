package com.example.designpatterns.practise;

public class FrontendDeveloper implements Worker{

    private boolean isAvailable = false;
    private int breaks;


    public FrontendDeveloper(int breaks) {
        if(breaks>0){
            this.breaks = breaks;
        }else{
            this.breaks = 2;
        }
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public void startWork(int hours) {
        if(!isAvailable){
            this.isAvailable = true;
            System.out.println("Ready to fight :)");
        }else{
            System.out.println("I am already ready!");
        }
    }

    @Override
    public void takeBreak() {
        if(breaks > 0){
            this.breaks--;
            System.out.println("Let's go to the brake... Remains " + breaks + " breaks");
        }else{
            System.out.println("There are no breaks available :(");
        }
    }

    @Override
    public void setBreak(boolean isNextBreak) {
        if(isNextBreak){
            breaks++;
        }else{
            System.out.println("I think I am not exhausted, so I don't need next break :)");
        }
    }

    @Override
    public void finishWork() {
        if(isAvailable){
            System.out.println("Time to go home :)");
            this.isAvailable = false;
        }else{
            System.out.println("I can't finish something that is finished...");
        }
    }
}
