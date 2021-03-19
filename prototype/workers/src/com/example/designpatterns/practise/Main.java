package com.example.designpatterns.practise;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<>();
        List<Worker> workersCopy = new ArrayList<>();

        Manager manager = new Manager();
        manager.name = "Lucas";
        manager.surname = "Popeye";
        manager.age = 25;
        manager.salary = 4000;
        manager.branch = "Java";

        workers.add(manager);

        Manager anotherManager = (Manager) manager.clone();
        workers.add(anotherManager);

        BackendDeveloper developer = new BackendDeveloper();
        developer.name = "Sebastian";
        developer.surname = "Harrison";
        developer.age = 22;
        developer.salary = 15000;
        developer.programmingLanguage = "Python";

        workers.add(developer);

        BackendDeveloper anotherDeveloper = (BackendDeveloper) developer.clone();
        workers.add(anotherDeveloper);

        compareWorkersLists(workers, workersCopy);
    }

    private static void compareWorkersLists(List<Worker> workers1, List<Worker> workers2){
        for(Worker worker : workers1){
            workers2.add(worker.clone());
        }

        for(int i=0; i<workers1.size(); i++){
            if(workers1.get(i) != workers2.get(i)){
                System.out.println(i + ": Objects are different :)");
                if(workers1.get(i).equals(workers2.get(i))){
                    System.out.println(i + ": They are identical workers!");
                }else{
                    System.out.println(i + ": They are NOT identical workers!!!");
                }
            }else{
                System.out.println(i + ": Objects are the same :(");
            }
        }
    }
}
