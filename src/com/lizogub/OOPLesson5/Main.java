package com.lizogub.OOPLesson5;

public class Main {

    public static void main(String[] args){

        MyCollectionGeneric<String> obj = new MyCollectionGeneric<String>(new String[1]);

        obj.add("My list");
//        obj.add("List 1");

        System.out.println(obj.toString());
    }
}
