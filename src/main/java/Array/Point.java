package Array;


public class Point implements Comparable<Point> {
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

    @Override
    public int compareTo(Point o) {

        if (this.x > o.x) {
            return 1;
        }
        if (this.x < o.x) {
            return -1;
        }
        if (this.y > o.y) {
            return 1;
        }
        if (this.y < o.y) {
            return -1;
        }

        return 0;
    }
}
