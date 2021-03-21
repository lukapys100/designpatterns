package com.example.designpatterns.practise;

public class Main {

    public static void main(String[] args) {
	    doSomething(new BackendDeveloper());
	    doSomething(new FrontendDeveloper(3));
    }

    static void doSomething(Worker worker){
        System.out.println("Manager: ");
        Manager manager = new Manager("Python", worker);
        manager.callForWorker();
        manager.orderBreak();
        manager.doDailyWork();
        worker.takeBreak();

        System.out.println("SuperManager: ");
        SuperManager superManager = new SuperManager("Java", worker);
        superManager.callForWorker();
        superManager.fire();
        worker.finishWork();
        worker.startWork(8);
        worker.finishWork();
    }
}
