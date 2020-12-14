package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MassVectorMain {


    public static void main(String[] args) {

        Vector v1 = new Vector(new Point(12, 56), new Point(45, 89));
        Vector v2 = new Vector(new Point(4, 6), new Point(125, 235));
        Vector v3 = new Vector(new Point(17, 5), new Point(10, 25));
        Vector v4 = new Vector(new Point(4, 6), new Point(47, 58));
        Vector v5 = new Vector(new Point(20, 1), new Point(36, 12));

        Vector[] mas = {v1, v2, v3, v4, v5};

        List<Point> points = new ArrayList<>();

        for (int i = 1; i < mas.length; i++) {

            points.add(mas[i].head);
            points.add(mas[i].tail);

        }

        Collections.sort(points);

        System.out.println(points);

    }
}
