package com.example.designpatterns.practise;

public abstract class Worker {

    public String name;
    public String surname;
    public int age;
    public int salary;

    public Worker(){
    }

    public Worker(Worker worker) {
        if(worker != null){
            this.name = worker.name;
            this.surname = worker.surname;
            this.age = worker.age;
            this.salary = worker.salary;
        }
    }

    public abstract Worker clone();

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Worker)){
            return false;
        }
        Worker anotherWorker = (Worker) obj;
        return anotherWorker.name.equals(name)
                && anotherWorker.surname.equals(surname)
                && anotherWorker.age == age
                && anotherWorker.salary == salary;
    }
}
