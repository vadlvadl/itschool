package com.lizogub.OOPLesson4;

public class Main {

    public static void task1(){
        MyCollection c1 = new MyCollection();

        System.out.println(c1.toString());
        c1.add(23);
        c1.add(14);
        c1.addByIndex(52,1);
        c1.add(15);
        c1.add(4);
        c1.add(9);
        c1.addByIndex(41,1);
        c1.add(14);

        System.out.println(c1.toString());

        if (c1.ifContains(14)){
            System.out.println("\nCollection contains number 14");
        } else {
            System.out.println("\nCollection doesn't contain number 14");
        }

        MyCollection c2 = c1.getCollection();
        System.out.println("Copied collection: " + c2.toString());

        if(c1.equals(c2)) System.out.println("C1 equals C2");

        c1.delete(2);
        System.out.println(c1.toString());
        if(c1.equals(c2)) {
            System.out.println("C1 equals C2 after deleting 2");
        } else {
            System.out.println("C1 doesn't equal C2 after deleting 2");
        }


        System.out.println("Index of number 14 -> " + c1.find(14));
        System.out.println("Index of last number 14 -> " + c1.findLast(14));
        c1.clear();
        System.out.println(c1.toString());
    }

    public static void task2(){
        User u1 = new User("Ivan","ivan1","psw1",12);
        User u2 = new User("Igor","igor.kiev","psw1",13);
        User u3 = new User("Sasha","alex","psw1",15);
        User u4 = new User("Oleg","oleg.odessa","psw1",4);

        DBUsers db = new DBUsers();
        db.addUser(u1);
        db.addUser(u2);
        db.addUser(u3);
        db.addUser(u4);

        System.out.println(db.getInfo());
    }

    public static void main(String args[]){
       task2();
    }
}
