package calculator;

import java.util.Scanner;

public class Calculator {
    Scanner in = new Scanner(System.in);

    int scaner() {
        int num = in.nextInt();
        return num;
    }

    public static void main(String[] args) {
        int x, y;
        Calculator calculator = new Calculator();
        System.out.println("Введіть число 1: ");
        x = calculator.scaner();

        System.out.println("Введіть число 2: ");
        y = calculator.scaner();


    }
}