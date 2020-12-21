package Array;

public class CoordinateBoard {
    int x1;
    int x2;
    int y1;
    int y2;

    public CoordinateBoard(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public boolean contains(Point a) {
        if ((a.x > x1) && (a.x < x2) && ((a.y > y1) && (a.y < y2))) {
            return true;
        } else return false;

    }

    public boolean contains(Vector v) {
        if (this.contains(v.head) && this.contains(v.tail)) {
            return true;
        } else return false;

    }
}