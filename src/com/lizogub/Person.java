package com.lizogub;

public class Person {

    private String name;
    private String surname;
    private int age;
    private String color;

    // Alt + Insert
    public Person() {

    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age, String color) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.color = color;
    }

    public int getAge(){
        return this.age;
    }

    public String getColor() {
        return this.color;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static void say(){
        System.out.println("Hey)");
    }

    public void say(String s){
        System.out.println("I say \"" + s + "\"");
    }
}
