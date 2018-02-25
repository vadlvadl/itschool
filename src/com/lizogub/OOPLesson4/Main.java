package com.lizogub.OOPLesson4;

public class Main {


    public static void main(String args[]){
        MyCollection c1 = new MyCollection();

        System.out.println(c1.toString());
        c1.add(23);
        c1.add(14);
        c1.addByIndex(52,1);

        System.out.println(c1.toString());

        if (c1.ifContains(14)){
            System.out.println("contains");
        } else {
            System.out.println("doesn't contain");
        }

        MyCollection c2 = c1.getCollection();
        System.out.println("Copied collection: " + c2.toString());


        c1.delete(2);
        System.out.println(c1.toString());
        c1.clear();
        System.out.println(c1.toString());


    }
}
