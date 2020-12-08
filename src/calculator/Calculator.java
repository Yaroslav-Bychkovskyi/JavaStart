package calculator;

import java.util.Scanner;

public class Calculator {
    Scanner in = new Scanner(System.in);

    int scaner() {
        int num = in.nextInt();
        return num;
    }

    String action() {
        String symbol = in.next();
        return symbol;
    }

    public static void main(String[] args) {
        int x, y, z;
        Calculator calculator = new Calculator();
        System.out.println("Введіть число 1: ");
        x = calculator.scaner();

        System.out.println("Введіть число 2: ");
        y = calculator.scaner();

        System.out.println("Введіть дію: ");

        String string;
        string = calculator.action();
        if (string.equals("+")) {

            z = x + y;
        } else z = 0;

        System.out.println("Відповідь: ");
        System.out.println(z);

    }
}