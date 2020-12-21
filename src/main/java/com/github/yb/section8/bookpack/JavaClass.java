package com.github.yb.section8.bookpack;
import java.util.Locale;
public class JavaClass {
    public static void main(String args[]){
        String Str = new String("Добро пожаловать на ProgLang.su");

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.toUpperCase());

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.toUpperCase(Locale.ENGLISH));
    }
}
