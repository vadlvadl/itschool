package com.lizogub;

import javafx.scene.Scene;
import jdk.management.cmm.SystemResourcePressureMXBean;

import java.util.Scanner;

public class HomeWork2 {

    public static void task1(){
        double a = 0, b = 0, r=0;

        Scanner scn = new Scanner(System.in);

        System.out.println("Введите число a:");
        a = scn.nextDouble();

        System.out.println("Введите число b:");
        b = scn.nextDouble();

        if(Math.abs(b) > 0.){
            r = a / b;
            System.out.println(a + "/" + b + "=" + r);
        } else {
            System.out.println("На ноль делить не хорошо :(");
        }
    }

    public static void task2(){
        int a = 0;
        int year = 1794; // Год основания Одессы

        Scanner scn = new Scanner(System.in);

        System.out.println("В каком году была основана Одесса?");
        a = scn.nextInt();

        if(Math.abs(a - year) > 0){
            System.out.println("Вы ошиблись, Одесса была основана в " + year + " году");
         }else{
            System.out.println("Верно!");
        }
    }

    public static void task3(){
        double a = 0, payment = 0;
        int price = 0, discount = 0;
        int discount1 = 3; // скидка 3%
        int discount2 = 5; // скидка 5%

        Scanner scn = new Scanner(System.in);
        System.out.println("Введите стоимость покупки:");
        a = scn.nextDouble();

        // Вычислим цену в копейках
        price = (int) Math.round(a * 100);

        if(price > 99999){
            discount = (int) Math.round(price * discount2 / 100D);
            payment = (price - discount) / 100D;

            System.out.println("Ваша скидка: " + discount2 + "%");
            System.out.println("Скидка составляет: " + discount / 100D);
            System.out.println("Сумма с учетом скидки: " + payment);

        }else if(price > 49999){
            discount = (int) Math.round(price * discount1 / 100D);
            payment = (price - discount) / 100D;

            System.out.println("Ваша скидка: " + discount1 + "%");
            System.out.println("Скидка составляет: " + discount / 100D);
            System.out.println("Сумма с учетом скидки: " + payment);

        }else{
            System.out.println("К сожалению, скидка вам не предоставляется");
        }
    }

    public static void task4(){
        int a = 0;

        Scanner scn = new Scanner(System.in);

        System.out.println("Введите целое число:");
        a = scn.nextInt();

        if((a % 2) > 0){
            System.out.println("Введенное число " + a + " нёчетное");
        } else {
            System.out.println("Введенное число " + a + " чётное");
        }
    }

    public static void task5(){
        int a = 0;

        Scanner scn = new Scanner(System.in);

        System.out.println("Введите целое число:");
        a = scn.nextInt();

        if((a % 3) > 0){
            System.out.println("Введенное число " + a + " не делится на 3");
        } else {
            System.out.println("Введенное число " + a + " делится на 3");
        }
    }

    public static void task6(){
        int minutes = 0, day = 0;
        int discount = 20; // Скдика, предоставляемая в выходные
        double price = 6; // Стоимость одной минуты
        double payment = 0;

        Scanner scn = new Scanner(System.in);

        System.out.println("Введите исходные данные:");
        System.out.println("Длительность разговора (в минутах, целое число):");
        minutes = scn.nextInt();

        System.out.println("День недели (1 - понедельник, ... , 7 - воскресенье:");
        day = scn.nextInt();

        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                payment = price * minutes;
                System.out.println("Стоимость разговора: " + payment + "грн");
                break;
            case 6:
            case 7:
                payment = price * minutes * (1 - discount / 100D);
                System.out.println("Скидка: " + discount + "%");
                System.out.println("Стоимость разговора: " + payment + "грн");
            deafult:
                System.out.println("Вы введи некорректный день недели");
        }
    }

    public static void task7(){
        int n = 0, first = 0, second = 0, third = 0;
        String a = "", b = "", c ="";

        Scanner scn = new Scanner(System.in);

        System.out.println("Введите 3-х значеное целое число");
        n = scn.nextInt();

        if((n > 99) && (n < 1000)){
            first = (int) n / 100;
            second = (int) (n - first * 100) / 10;
            third = (int) (n - first * 100 - second * 10);

            a = (first > third) ? "Первая цифра больше чем третья" : "Третья цифра больше чем первая";
            b = (first > second) ? "Первая цифра больше чем вторая" : "Вторая цифра больше чем первая";
            c = (second > third) ? "Вторая цифра больше чем третья" : "Третья цифра больше чем вторая";

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);

        }else{
            System.out.println("Введённое число не является 3-х значным");
        }
    }

    public static void task8(){
        int n = 0, first = 0, second = 0, third = 0;

        Scanner scn = new Scanner(System.in);

        System.out.println("Введите 3-х значеное целое число");
        n = scn.nextInt();

        if((n > 99) && (n < 1000)){
            first = (int) n / 100;
            second = (int) (n - first * 100) / 10;
            third = (int) (n - first * 100 - second * 10);

            if((n * n - (Math.pow(first,3) + Math.pow(second,3) + Math.pow(third,3))) > 0){
                System.out.println("Квадрат числа не равен сумме кубов его цифр");
            } else {
                System.out.println("Квадрат числа равен сумме кубов его цифр");
            }
        }else{
            System.out.println("Введённое число не является 3-х значным");
        }
    }

    public static void task9(){
        double x = 4, y = 3, x1 = 0;

        System.out.println("Исходные числа:\n x = " + x + "\n y = " + y);

        if(x < y){
            x1 = (x + y) / 2;
            y = 2 * x * y;
            x = x1;
        } else {
            x1 = 2 * x * y;
            y = (x + y) / 2;
            x = x1;
        }

        System.out.println("Результат:\n x = " + x + "\n y = " + y);
    }

    public static void task10(){
        // ax3 + bx = 0   ->   ax2 + b = 0
        int a = 34, c = -14;
        double d = 0, x = 0;

        d =  -4 * a * c;
        if (d > 0){
            x = Math.sqrt(d) / (2 * a);

            System.out.println("Корни уравнения: " + x + ", -" + x);
        } else {
            System.out.println("Действительных корней нет");
        }
    }

    public void run(){
//        System.out.println("Homework2 :: Task1");
//        this.task1();

//        System.out.println("Homework2 :: Task2");
//        this.task2();

//        System.out.println("Homework2 :: Task3");
//        this.task3();

//        System.out.println("Homework2 :: Task4");
//        this.task4();

//        System.out.println("Homework2 :: Task5");
//        this.task5();

//        System.out.println("Homework2 :: Task6");
//        this.task6();

//        System.out.println("Homework2 :: Task7");
//        this.task7();

//        System.out.println("Homework2 :: Task8");
//        this.task8();

//        System.out.println("Homework2 :: Task9");
//        this.task9();

//        System.out.println("Homework2 :: Task10");
//        this.task10();
    }
}
