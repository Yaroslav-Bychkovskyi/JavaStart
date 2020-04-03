public class QuadraticEquationResult {
    double x1, x2;

    @Override
    public String toString() {
        return "QuadraticEquationResult{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                '}';
    }

    public QuadraticEquationResult(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }
}
