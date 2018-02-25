package com.lizogub.OOPLesson3;

public class BadPupil extends Pupil implements PupilInterface{

    public BadPupil(String name){
        super(name);
    }

    public String howStudy(){
        return "Bad";
    }

    public String howRead(){
        return "Bad";
    }

    public String howWrite(){
        return "Awful";
    }

    public String howRest(){
        return "Excelent";
    }
}
