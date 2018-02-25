package com.lizogub.OOPLesson3;

public class ClassRoom {
    Pupil[] pupils = new Pupil[4];

    public ClassRoom(){

    }

    public ClassRoom(Pupil pupil1, Pupil pupil2){
        pupils[0] = pupil1;
        pupils[1] = pupil2;
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3){
        pupils[0] = pupil1;
        pupils[1] = pupil2;
        pupils[2] = pupil3;
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4){
        pupils[0] = pupil1;
        pupils[1] = pupil2;
        pupils[2] = pupil3;
        pupils[3] = pupil4;
    }

    public void getInfo(){

        for(Pupil p : pupils){
            System.out.println("|" +
                                p.getName() + "\t| " +
                                p.howStudy() + "\t| " +
                                p.howRead() + "\t| " +
                                p.howWrite() + "\t| " +
                                p.howRest() + "|"
                    );
        }
    }
}
