package com.lizogub.HomeWork7;

import java.util.Scanner;

public class Main {

    public static void task1(){
        FractionNumber R = new FractionNumber();
        FractionNumber x1 = new FractionNumber(5,4);
        FractionNumber x2 = new FractionNumber(1,4);
        FractionNumber x3 = new FractionNumber(1,2);

        R = x1.add(x2);
        System.out.println("R = " + R.getString());
        System.out.println("1/R = " + (R.pow(-1)).getString());

        R = x1.add(x3);
        System.out.println("R = " + R.getString());
        System.out.println("1/R = " + (R.pow(-1)).getString());
    }

    public static void task2(){
        // Как работать с динамическими массивами?

        Scanner scn  = new Scanner(System.in);

        System.out.println("Введите кол-во строк матрицы:");
        int rows = scn.nextInt();

        System.out.println("Введите кол-во столбцов матрицы:");
        int cols = scn.nextInt();

        FractionNumber[][] numbers = new FractionNumber[rows][cols];

        int x = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.println("Введите элемент [" + i + "][" + j + "]");
                x = scn.nextInt();
                numbers[i][j] = new FractionNumber(x);
            }
        }

        Matrix mx = new Matrix(numbers);

        System.out.println(mx.getString());
    }

    public static void task3(){
        Point a = new Point(2,2,"A");
        Point b = new Point(2,5,"B");
        Point c = new Point(3,5,"C");
        Point d = new Point(3,2,"D");
        Figure fig = new Figure(a,b,c,d);

        System.out.println("Polygon Name \"" + fig.getName() + "\", perimeter: " + fig.PerimeterCalculator());
    }

    public static void main(String[] args) {
        // write your code here
//        task2();
        boolean a = true;


    }
}
