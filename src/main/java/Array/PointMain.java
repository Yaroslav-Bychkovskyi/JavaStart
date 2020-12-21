package Array;


import java.util.ArrayList;
import java.util.List;

public class PointMain {
    public static void main(String[] args) {

        List<Point> result = new ArrayList<>();

        Point[] a = {new Point(10, 20), new Point(42, 99), new Point(10, 3), new Point(97, 39), new Point(17, 44), new Point(48, 48)};
        Point[] b = {new Point(10, 3), new Point(4, 9), new Point(62, 15), new Point(12, 159), new Point(96, 54), new Point(10, 20)};


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i].equals(b[j])) {
                    System.out.println(a[i] + " " + b[j]);
                    result.add(a[i]);
                }
            }
        }
        System.out.println(result);


    }
}
