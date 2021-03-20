package com.example.designpatterns.practise;

public class SuperManager extends Manager {

    public SuperManager(String branch, Worker worker) {
        super(branch, worker);
    }

    public void fire(){
        if(worker.isAvailable()){
            worker.finishWork();
        }
    }
}
