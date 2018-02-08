package com.lizogub;

public class Class3Cycle {
    public static void task1(){
        int a = 12345679, r = 0;

        for (int i = 9; i < 82; i+=9){
            r = a * i;
            System.out.println(a + " * " + i + " = " + r);
        }
    }

    public static void task2(){
        int a = 7, r = 0;

        for (int i = 1; i < 10; i++){
            r = a * i;
            System.out.println(a + " * " + i + " = " + r);
        }
    }

    public static void task3(){

        for (int i = 2; i < 21; i++){
            System.out.println("sin" + i + " = " + Math.sin(i));
        }
    }


    public double getFactorial(int a){
        double r = 1;

        for (int i = 2; i <= a; i++){
            r = r * i;
        }

        return r;
    }

    public void task4(){
        double x = 9, f = 0, r;
        boolean isOdd = true;

        r = x;
        for (int i = 3; i < 14; i+=2){
            f = this.getFactorial(i);

            if(isOdd){
                r = r - Math.pow(x,i) / f;
                System.out.println(i + " <-> " + r);
            } else {
                r = r + Math.pow(x,i) / f;
                System.out.println(i + "  <+>  " + r);
            }

            isOdd = !isOdd;
        }

        System.out.println("Результат " + r);
    }

    public static void task5(){
        float a = 1, b = 20;
        float h = 1;

        double funcA = 0, funcB = 0;

        System.out.println(" X  ->    F(x) = tan(x)    ->    F(x) = ctg(x) + 1");

        while(a < b){
            funcA = Math.tan(a);
            funcB = 1 / Math.tan(a) + 1;

            System.out.println(a + " ->\t" + funcA + "\t| " + funcB);
            a += h;
        }
    }

    public void run(){
//        this.task1();
//        this.task2();
//        this.task3();
//        this.task4();
//        this.task5();

        int a = 2, b = 5;

        int c = (a >= b) ? b : a; System.out.println(!(b==a));
    }
}
