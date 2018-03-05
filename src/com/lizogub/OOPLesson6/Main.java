package com.lizogub.OOPLesson6;

public class Main {
    public static void task1(){
        EmployeeHourlyPay e1 = new EmployeeHourlyPay("Jack");
        EmployeeHourlyPay e2 = new EmployeeHourlyPay("Jill");
        EmployeeMonthlyPay e3 = new EmployeeMonthlyPay("Ivan");
        EmployeeMonthlyPay e4 = new EmployeeMonthlyPay("Igor");
        EmployeeHourlyPay e5 = new EmployeeHourlyPay("Robert");

        e1.setSalary(23);
        e2.setSalary(53);
        e3.setSalary(12780.8);
        e4.setSalary(5322.43);
        e5.setSalary(81.23);

        GenCol<Worker> staff = new GenCol<Worker>();
        staff.add(e1);
        staff.add(e2);
        staff.add(e3);
        staff.add(e4);
        staff.add(e5);

        for(Worker x : staff){
            System.out.println(x.name() + " - " + x.getSalary() + " uah");
        }
    }

    public static void task2(){
        GenCol<String> arr = new GenCol<String>();

        arr.add("Line 1");
        arr.add("line 2");
        arr.add("line 3");
        arr.add("line 4");
        arr.add("line 5");

        for(String x : arr){
            System.out.println(x);
        }

        arr.remove(2);
        for(String x : arr){
            System.out.println(x);
        }

        arr.clear();
        for(String x : arr){
            System.out.println(x);
        }
    }

    public static void main(String[] args){
        task1();

    }
}
