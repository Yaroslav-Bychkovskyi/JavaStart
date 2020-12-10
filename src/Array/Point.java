package Array;

import java.util.ArrayList;
import java.util.List;

public class Point {
    public int x;
    public int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public boolean equals(Object obj) {
        Point r = (Point) obj;
        boolean result = this.x == r.x && this.y == r.y;
        return (result);
    }
}
