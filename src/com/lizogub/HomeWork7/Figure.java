package com.lizogub.HomeWork7;

public class Figure {
    private Point[] point = new Point[5];

    public Figure(Point a, Point b, Point c) {
        this.point[0] = a;
        this.point[1] = b;
        this.point[2] = c;
    }

    public Figure(Point a, Point b, Point c, Point d) {
        this.point[0] = a;
        this.point[1] = b;
        this.point[2] = c;
        this.point[3] = d;
    }

    public Figure(Point a, Point b, Point c, Point d, Point e) {
        this.point[0] = a;
        this.point[1] = b;
        this.point[2] = c;
        this.point[3] = d;
        this.point[4] = e;
    }

    public String getName(){
        String name = "";
        for (int i = 0; i < this.point.length; i++){

            if(this.point[i] != null){
                name += this.point[i].getName();
            } else {
                break;
            }
        }
        return name;
    }

    public double lengthSide(Point A, Point B){
        double x;
        double y;

        x = Math.abs(B.getX() - A.getX());
        y = Math.abs(B.getY() - A.getY());

        if(x == 0){
            return y;
        } else if (y == 0) {
            return x;
        } else {
            return Math.sqrt(x * x + y * y);
        }
    }

    public double PerimeterCalculator(){
        double sum = 0;
        for (int i = 1; i <= this.point.length; i++){

            if((i < this.point.length) && (this.point[i] != null)){
                sum += this.lengthSide(this.point[i],this.point[i-1]);
            } else {
                sum += this.lengthSide(this.point[i-1],this.point[0]);
                break;
            }
        }
        return sum;
    }
}
