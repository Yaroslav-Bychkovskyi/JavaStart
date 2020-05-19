package com.github.yb.section6;

public class StaticBlock {
    static double rooOf2;
    static double rooOf3;

    static {
        System.out.println("Внутри статического блока");
        rooOf2 = Math.sqrt(2.0);
        rooOf3 = Math.sqrt(3.0);
    }

    StaticBlock(String msg) {
        System.out.println(msg);
    }
}

class SDemo3 {
    public static void main(String[] args) {
        StaticBlock ob = new StaticBlock("Внутри конструктора");
        System.out.println("Корень квадратный из 2 равен" + StaticBlock.rooOf2);
        System.out.println("Корень квадратный из 3 равен" + StaticBlock.rooOf3);
    }
}
