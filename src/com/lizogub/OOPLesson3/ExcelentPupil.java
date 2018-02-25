package com.lizogub.OOPLesson3;

public class ExcelentPupil extends Pupil implements PupilInterface {

    public ExcelentPupil(String name){
        super(name);
    }

    public String howStudy(){
        return "Excelent";
    }

    public String howRead(){
        return "Excelent";
    }

    public String howWrite(){
        return "Excelent";
    }

    public String howRest(){
        return "Awful :-(";
    }
}
