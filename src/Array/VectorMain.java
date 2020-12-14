package Array;

import java.util.Arrays;

public class VectorMain {

    Vector v1 = new Vector(new Point(12, 56), new Point(45, 89));
    Vector v2 = new Vector(new Point(4, 6), new Point(125, 235));
    Vector v3 = new Vector(new Point(17, 5), new Point(10, 25));
    Vector v4 = new Vector(new Point(4, 6), new Point(47, 58));
    Vector v5 = new Vector(new Point(20, 1), new Point(36, 12));

    Vector[] mas = {v1, v2, v3, v4, v5};

    public static void main(String[] args) {
        VectorMain vectorMain = new VectorMain();

        System.out.println(" Виведення - " + Arrays.toString(vectorMain.mas));
        Arrays.sort(vectorMain.mas);
        System.out.println(" Виведення - " + Arrays.toString(vectorMain.mas));


    }
}
