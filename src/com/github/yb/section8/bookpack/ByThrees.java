package com.github.yb.section8.bookpack;

public class ByThrees implements Series {
    int start;
    int val;

    ByThrees() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 3;
        return val;
    }

    @Override
    public void reset() {
        start = 0;
        val = 0;

    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;

    }
}

class SeriesDemo2 {
    public static void main(String[] args) {
        Series twoOb = new ByTwos();
        Series threeOb = new ByThrees();
        Series ob;

        for (int i = 0; i < 5; i++) {
            ob = twoOb;
            System.out.println("Следующее значения ByTwos: " + ob.getNext());
            ob = threeOb;
            System.out.println("Следующее значения ByThrees: " + ob.getNext());
        }
    }
}
