public class Triangle {
    double a, b, c;

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Площа трикутника
    public double areaTriangle() {
        double S, p;
        p = (a + b + c) / 2;
        S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return S;
    }

    //Довжина сторін
    public double lengthSides() {
        double L;
        L = a + b + c;
        return L;
    }

    //Рівносторонній
    public boolean equilateral() {
        return a == b && b == c;
    }

    //Прямокутній
    public boolean rectangular() {
        if ((a * a + b * b == c * c)) return true;
        if ((c * c + b * b == a * a)) return true;
        if ((a * a + c * c == b * b)) return true;
        return false;

    }

    //рівнобедрений
    public boolean isosceles() {
        return a == b || b == c || a == c;
    }


    public static void main(String[] args) {

        Triangle triangle = new Triangle(5,4,3);
        double v = triangle.areaTriangle();
        boolean equilateral = triangle.equilateral();
        double v1 = triangle.lengthSides();
        boolean rectangular = triangle.rectangular();
        boolean isosceles = triangle.isosceles();

        System.out.println();

    }
}