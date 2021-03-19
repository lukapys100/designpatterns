package com.example.designpatterns.practise;

public class Manager extends Worker {

    public String branch;

    public Manager() {
    }

    public Manager(Manager manager){
        super(manager);
        if(manager != null){
            this.branch = manager.branch;
        }
    }

    @Override
    public Worker clone() {
        return new Manager(this);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Manager) || !super.equals(obj)){
            return false;
        }
        Manager anotherManager = (Manager) obj;
        return anotherManager.branch.equals(branch);
    }
}
