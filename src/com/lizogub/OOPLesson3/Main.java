package com.lizogub.OOPLesson3;

import java.util.Scanner;

public class Main {
/*
    instanceof();
    super()

    ad-hpc полиморфиз
    классический полиморфизм

    abstract class  - нельзя создать обьект этого класса (животные, собачьи), нету конструктора

    приведение к базовому типу - вызываются методы родительского класса
    использование виртуальных членов

 */

    public static void test1(){
//        SubClass obj = new SubClass("TestSuper",5,"brown");
//
//        System.out.println(obj.add(6,3));
//        System.out.println(obj.sub(4,3));
//
//        SuperClass obj2 = new SubClass("Test2",4,"red");
//        System.out.println(obj2.add(4,3));
//        System.out.println(obj2.sub(4,3));

    }

    public static void task1(){

        Pupil p1 = new ExcelentPupil("Ivan");
        Pupil p2 = new BadPupil("Vasya");
        Pupil p3 = new GoodPupil("Petro");
        Pupil p4 = new ExcelentPupil("Olga");

        ClassRoom cl1 = new ClassRoom(p1,p2,p3,p4);

        cl1.getInfo();
    }

    public static void task2(){
        Plane plane1 = new Plane();
        Vehicle ship1 = new Ship();
        Vehicle car1 = new Car();

        plane1.setAltitude(8500);
        plane1.setMaxPassengers(350);

        ship1.year = 1981;
        ship1.speed = 23;
        ship1.price = 583000;
        ship1.latitude = (float) 23.2432174;
        ship1.longitude = (float) 73.234241241;

        car1.price = 23000;
        car1.speed = 230;
        car1.year = 2012;

        System.out.println(plane1.getInfo());
        System.out.println(ship1.getInfo());
        System.out.println(car1.getInfo());

    }

    public static void task3(){
        Scanner scn = new Scanner(System.in);
        boolean userHasKey = false;

        System.out.println("У вас есть ключ доступа? (y/n)");
        while (true){
            String hasKey = scn.next();
            if(hasKey.equals("y")){
                userHasKey = true;
                break;
            } else if(hasKey.equals("n")){
                userHasKey = false;
                break;
            }
        }

        if(userHasKey){
            System.out.println("Введите ключ доступа (pro - 1234, exp - 4321) :");
            while (true){
                String key = scn.next();
                if(key.equals("1234")){
                    ProDocumentWorker document = new ProDocumentWorker();
                    break;
                } else if(key.equals("4321")){
                    ExpertDocumentWorker document = new ExpertDocumentWorker();
                    break;
                }
            }
        }
    }

    public static void main(String args[]){
        task2();

    }
}
