package com.github.yb.section8.bookpack;

public class Rethrow {
    public static void gebException() {
        int numer[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int demon[] = {2, 0, 4, 4, 0, 8};
        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " + demon[i] + " равно " + numer[i] / demon[i]);
            } catch (ArithmeticException exc) {
                System.out.println("Попытка деления на нуль");
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Соответствующий элемент не найден");
                throw exc;
            }
        }
    }
}


class RethrowDemo {
    public static void main(String[] args) {
        try {
            Rethrow.gebException();
        } catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Фатальная ошибка - " + "выполнение программы прервано!");
        }
    }
}