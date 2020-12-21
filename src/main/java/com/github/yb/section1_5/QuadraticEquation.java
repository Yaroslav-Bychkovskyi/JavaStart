package com.github.yb.section1_5;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) throws java.io.IOException {

        double a;
        double b;
        double c;

        do {
            System.out.println("Введіть а:");
            a = enterNumber();
            if (a == 0) {
                System.out.println("Помилка а != 0");
            } else {
                System.out.println("Введено число a = " + a);
                break;
            }
        } while (true);

        System.out.println("Введіть b:");
        b = enterNumber();

        System.out.println("Введіть c:");
        c = enterNumber();

        System.out.println("Квадратне рівняння \n" + a + "*x1^2 + " + b + "*x2 + " + c + " = 0");

        QuadEquation v = new QuadEquation(a, b, c);
        System.out.println(v.result());

    }

    public static double enterNumber() {
        double p = 0;
        String line = "";
        Scanner sc = new Scanner(System.in);
        do {
            if (sc.hasNext()) {
                line = sc.next();
                if (isNumeric(line)) {
                    p = Double.parseDouble(line);
                    System.out.println("Введено число = " + p);
                    break;
                } else {
                    System.out.println("Введено не число");
                }
            }
        } while (true);
        return p;
    }


    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
