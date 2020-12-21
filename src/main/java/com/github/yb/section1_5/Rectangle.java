package com.github.yb.section1_5;

public class Rectangle {
    double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "com.github.yb.section5.Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    //Площа прямокутника
    public double areaRectangle() {
        double S;
        S = a * b;
        return S;
    }

    //Довжина сторони прямокутника
    public double lengthSideRectangle() {
        double L;
        L = (a + b) * 2;
        return L;

    }
}
