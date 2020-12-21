package Imitation;

public class Square extends Rectangle implements Figure {

    public Square(double a) {
        super(a, a);
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }

}
