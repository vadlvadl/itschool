package com.lizogub.OOPLesson3;

abstract class Vehicle {
    protected float longitude = 0;
    protected float latitude = 0;
    protected int price = 0;
    protected float speed = 0;
    protected int year = 0;

    abstract String getInfo();
}
