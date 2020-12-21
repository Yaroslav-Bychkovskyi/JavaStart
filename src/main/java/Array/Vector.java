package Array;

public class Vector implements Comparable<Vector> {
    Point head;
    Point tail;

    public Vector(Point head, Point tail) {
        this.head = head;
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }

    @Override
    public int compareTo(Vector o) {
        if (this.head.compareTo(o.head) > 0) {
            return 1;
        }
        if (this.head.compareTo(o.head) < 0) {
            return -1;
        }

        if (this.tail.compareTo(o.tail) > 0) {
            return 1;
        }
        if (this.tail.compareTo(o.tail) < 0) {
            return -1;
        }
        return 0;
    }
}
