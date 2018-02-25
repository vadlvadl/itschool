package com.lizogub.OOPLesson3;

public class SubClass extends SuperClass implements InterfaceExample{
    public String color;

    public SubClass(String name, int number, String color) {
        super.name = name;
        super.number = number;
        this.color = color;
    }


    @Override
    public int add(int number, int number2) {
        return 0;
    }
}
