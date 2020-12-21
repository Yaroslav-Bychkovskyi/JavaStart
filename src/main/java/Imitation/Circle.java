package Imitation;

import static java.lang.Math.PI;

public class Circle implements Figure {
    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }

    public Circle(double r) {
        this.r = r;
    }

    double r;

    @Override
    public double square() {
        return PI * Math.pow(r , 2);
    }

    @Override
    public double perimeter() {
        return 2 * PI * r;
    }
}
