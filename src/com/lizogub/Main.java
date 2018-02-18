package com.lizogub;

import com.lizogub.HomeWork7.FractionNumber;

public class Main {

    public static void main(String[] args) {
//        Point a = new Point(2,2,"Point A");
//        Point b = new Point(2,5,"Point B");
//        Point c = new Point(3,5,"Point C");
//        Point d = new Point(3,2,"Point D");
//        Figure fig = new Figure(a,b,c,d);
//
//        System.out.println(fig.perimeterPolygon());

        FractionNumber x1 = new FractionNumber(3);
        FractionNumber x2 = new FractionNumber(1,4);

        System.out.println("'+': " + x1.add(x2));
        System.out.println("'-': " + x1.sub(x2));
        System.out.println("'*': " + x1.mul(x2));
    }
}
