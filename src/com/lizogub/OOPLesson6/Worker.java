package com.lizogub.OOPLesson6;

public abstract class Worker {
    protected int ID;
    protected double pay;
    protected String name;

    public Worker(String name){
        this.name = name;
    }

    public String name(){
        return this.name;
    }

    public void setSalary(double salary){
        this.pay = salary;
    }

    public abstract double getSalary();
}
