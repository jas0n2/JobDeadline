package com.example.jason.jobdeadline;

public class Student {

    private String name;
    private String id;
    private String Sync;

    public Student(String name, String id,String sync) {
        this.name = name;
        this.id = id;
        this.Sync = sync;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSync() {
        return Sync;
    }

    public void setSync(String sync) {
        Sync = sync;
    }
}
