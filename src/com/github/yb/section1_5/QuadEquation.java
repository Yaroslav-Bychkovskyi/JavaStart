package com.github.yb.section1_5;

public class QuadEquation {
    double a, b, c;

    public QuadEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    QuadraticEquationResult result() {
        double x1 = 0, x2 = 0, D;

        D = Math.pow(b, 2) - 4 * a * c;
        System.out.println("D = " + D);

        if (D < 0) {
            System.out.println("Рівняння коренів не має");
        } else if (D == 0) {
            x1 = -(b / 2 * a);
            x2 = x1;
            System.out.println("Корені равняння: " + x1 + "і" + x2);
        } else if (D > 0) {
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корені равняння: x1 = " + x1 + " і x2 = " + x2);

        }
        return new QuadraticEquationResult(x1, x2);
    }

}
