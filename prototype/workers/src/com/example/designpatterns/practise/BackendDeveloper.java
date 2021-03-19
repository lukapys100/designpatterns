package com.example.designpatterns.practise;

public class BackendDeveloper extends Worker {

    public String programmingLanguage;

    public BackendDeveloper() {
    }

    public BackendDeveloper(BackendDeveloper developer){
        super(developer);
        if(developer != null){
            this.programmingLanguage = developer.programmingLanguage;
        }
    }

    @Override
    public Worker clone() {
        return new BackendDeveloper(this);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof BackendDeveloper) || !super.equals(obj)){
            return false;
        }
        BackendDeveloper anotherDeveloper = (BackendDeveloper) obj;
        return anotherDeveloper.programmingLanguage.equals(programmingLanguage);
    }
}
