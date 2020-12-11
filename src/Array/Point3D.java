package Array;

public class Point3D {
    public int x;
    public int y;
    public int z;

    Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public boolean equals(Object obj) {
        Point3D d = (Point3D) obj;
        boolean result = this.x == d.x && this.y == d.y && this.z == d.z;
        return (result);
    }
}
