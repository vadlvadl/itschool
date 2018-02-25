package com.lizogub.OOPLesson3;

public class Pupil {
    private String name;

//    public  Pupil(){
//
//    }

    public Pupil(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String howStudy(){
        return "Unknown";
    }

    public String howRead(){
        return "Unknown";
    }

    public String howWrite(){
        return "Unknown";
    }

    public String howRest(){
        return "Unknown";
    }
}
