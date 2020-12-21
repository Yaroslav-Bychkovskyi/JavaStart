package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PointMain3D {
    public static void main(String[] args) {

        List<Point3D> res = new ArrayList<>();

        Point3D[] a = {new Point3D(10, 20, 30), new Point3D(42, 99, 45), new Point3D(10, 3, 3),
                new Point3D(97, 39, 19), new Point3D(17, 44, 67), new Point3D(48, 48, 23)};

        Point3D[] b = {new Point3D(10, 3, 3), new Point3D(4, 9, 2), new Point3D(62, 15, 7),
                new Point3D(12, 159, 234), new Point3D(97, 39, 19), new Point3D(10, 20, 30)};

        System.out.println(" Виведення - " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(" Виведення - " + Arrays.toString(a));

        System.out.println(" Виведення - " + Arrays.toString(b));
        Arrays.sort(b);
        System.out.println(" Виведення - " + Arrays.toString(b));

    }
}
