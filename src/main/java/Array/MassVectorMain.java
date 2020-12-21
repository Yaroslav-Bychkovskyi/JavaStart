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

        CoordinateBoard coordinateBoard = new CoordinateBoard(-10, 10, -10, 10);
        CoordinateBoard coordinateBoard2 = new CoordinateBoard(-50, 50, -50, 50);

        for (int i = 0; i < points.size(); i++) {
            if (coordinateBoard.contains(points.get(i))){
                System.out.println(points.get(i));

            }
            if (coordinateBoard2.contains(points.get(i))){
                System.out.println(points.get(i));
            }
        }

    }
}
