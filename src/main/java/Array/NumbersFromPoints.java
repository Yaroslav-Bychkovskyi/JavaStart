package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumbersFromPoints {
    public static void main(String[] args) {

        VectorMain vectorMain = new VectorMain();

        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < vectorMain.mas.length; i++) {

            if (!integers.contains(vectorMain.mas[i].head.x)) {
                integers.add(vectorMain.mas[i].head.x);
            }

            if (!integers.contains(vectorMain.mas[i].head.y)) {
                integers.add(vectorMain.mas[i].head.y);
            }

            if (!integers.contains(vectorMain.mas[i].tail.x)) {
                integers.add(vectorMain.mas[i].tail.x);
            }
            if (!integers.contains(vectorMain.mas[i].tail.y)) {
                integers.add(vectorMain.mas[i].tail.y);
            }
        }

        Collections.sort(integers);
        System.out.println(integers);

        int m = integers.get(0);
        int n = integers.get(0);

        for (int i = 1; i < integers.size(); i++) {
            if (integers.get(i) < m) {
                m = integers.get(i);
            }
            if (integers.get(i) > n) {
                n = integers.get(i);
            }

        }
        System.out.println(m);
        System.out.println(n);

    }

}
