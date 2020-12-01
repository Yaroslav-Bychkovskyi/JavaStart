package com.github.yb.section7;

public class TwoDShape2 {
    private double width;
    private double height;

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }

    void showDim() {
        System.out.println("Ширина и высота - " + width + " и " + height);
    }
}

class Triangle2 extends TwoDShape2 {
    private String style;

    public Triangle2(String s, double w, double h) {
        setWidth(w);
        setHeight(h);
        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}

class Shapes3{
    public static void main(String[] args) {
        TwoDShape2 t1 = new Triangle2("закрашенный", 4.0,4.0);
        TwoDShape2 t2 = new Triangle2("контурный", 8.0,12.0);

        System.out.println("Информация о t1: ");
       // t1.showStyle();
        t1.showDim();
      //  System.out.println("Площадь - " + t1.());
    }
}

