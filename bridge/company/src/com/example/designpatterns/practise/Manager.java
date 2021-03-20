package com.example.designpatterns.practise;

public class Manager implements Leader {

    private String branch;
    protected Worker worker;

    public Manager(String branch, Worker worker) {
        this.branch = branch;
        this.worker = worker;
    }

    public String getBranch() {
        return branch;
    }

    @Override
    public void callForWorker() {
        if(worker.isAvailable()){
            worker.setBreak(true);
            System.out.println("Take next break :)");
        }else{
            System.out.println("Worker is not available...");
        }
    }

    @Override
    public void orderBreak() {
        worker.takeBreak();
    }

    @Override
    public void doDailyWork() {
        worker.startWork(7);
        orderBreak();
        worker.finishWork();
    }
}
