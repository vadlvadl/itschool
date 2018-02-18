package com.lizogub.HomeWork7;

public class Point {
    private int x;
    private int y;
    private String name;

    public Point(int x, int y, String name){
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public String getName() {
        return name;
    }
}
