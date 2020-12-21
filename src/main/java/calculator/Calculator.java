package calculator;

import java.util.Scanner;

public class Calculator {
    Scanner in = new Scanner(System.in);

    int scaner() {
        int num = 0;
        if (in.hasNextInt()) {
            num = in.nextInt();

        } else {
            System.out.println("Помилка: ");
        }
        return num;
    }

    String action() {
        String symbol = in.next();
        if (symbol.equals("+") || symbol.equals("-") || symbol.equals("*") || symbol.equals("/")) {

        } else {
            System.out.println("Помилка: ");
        }

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
        } else if (string.equals("-")) {
            z = x - y;
        } else if (string.equals("*")) {
            z = x * y;
        } else if (string.equals("/")) {
            z = x / y;
        } else z = 0;

        System.out.println("Відповідь: ");
        System.out.println(z);

    }
}