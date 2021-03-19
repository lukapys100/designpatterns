package com.example.designpatterns.practise;

import java.util.HashMap;
import java.util.Map;

public class WorkersCache {

    private Map<String, Worker> workerMap = new HashMap<>();

    public WorkersCache() {
        Manager manager = new Manager();
        manager.name = "Charlie";
        manager.surname = "Stevenson";
        manager.age = 45;
        manager.branch = "Web";
        manager.salary = 10000;

        workerMap.put("Web manager", manager);

        BackendDeveloper developer = new BackendDeveloper();
        developer.name = "John";
        developer.surname = "Macmillan";
        developer.age = 40;
        developer.salary = 12000;
        developer.programmingLanguage = "PHP";

        workerMap.put("PHP Developer", developer);
    }

    public Worker put(String key, Worker worker){
        workerMap.put(key, worker);
        return worker;
    }

    public Worker get(String key){
        return workerMap.get(key).clone();
    }
}
