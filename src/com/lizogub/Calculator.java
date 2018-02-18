package com.lizogub;

import java.util.Scanner;

public class Calculator {
    private int a,b;

    public double sum(double a, double b){
        return a + b;
    }

    public double sub(double a, double b){
        return a - b;
    }

    public double mult(double a, double b){
        return a * b;
    }

    public double div(double a, double b){
        if(b == 0) {
            System.out.println("Division by zero");
            return 0;
        }
        return a / b;
    }

    public void start(){
        double a = 0, b = 0;
        boolean exitCalc = false;
        String action = "";

        Scanner scn = new Scanner(System.in);

        while(!exitCalc) {
            System.out.println("Введите первое число:");
            a = scn.nextDouble();

            System.out.println("Введите операцию (+,-,*,/). Для выхода введите exit:");
            action = scn.next();

            if(action.equals("exit")) {
                exitCalc = true;
                break;
            }

            System.out.println("Введите второе число:");
            b = scn.nextDouble();

            double result = 0;

            switch(action){
                case "+": result = this.sum(a,b); break;
                case "-": result = this.sub(a,b); break;
                case "*": result = this.mult(a,b); break;
                case "/": result = this.div(a,b); break;
            }

            System.out.println(a + " " + action + " " + b + " = " + result);

        }
    }
}
