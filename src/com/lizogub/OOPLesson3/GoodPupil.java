package com.lizogub.OOPLesson3;

public class GoodPupil extends Pupil implements PupilInterface{

    public GoodPupil(String name){
        super(name);
    }

    public String howStudy(){
        return "Good";
    }

    public String howRead(){
        return "Good";
    }

    public String howWrite(){
        return "Normal";
    }

    public String howRest(){
        return "So-so";
    }
}
