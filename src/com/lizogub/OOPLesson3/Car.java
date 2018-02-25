package com.lizogub.OOPLesson3;

public class Car extends Vehicle {

    @Override
    String getInfo() {
        return "Coordinates: " + longitude + ", " + latitude +
                "\nPrice: " + price +
                "\nSpeed: " + speed +
                "\nYear" + year;
    }
}
