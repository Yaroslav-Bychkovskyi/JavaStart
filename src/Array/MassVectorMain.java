package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MassVectorMain {


    public static void main(String[] args) {

        VectorMain vectorMain = new VectorMain();

        List<Point> points = new ArrayList<>();

        for (int i = 0; i < vectorMain.mas.length; i++) {

            if (!points.contains(vectorMain.mas[i].head)) {
                points.add(vectorMain.mas[i].head);
            }
            if (!points.contains(vectorMain.mas[i].tail)) {
                points.add(vectorMain.mas[i].tail);
            }
        }

        Collections.sort(points);
        System.out.println(points);

    }
}
