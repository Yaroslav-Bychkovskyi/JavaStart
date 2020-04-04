public class DemoVektor {
    double x, y, z;

    @Override
    public String toString() {
        return "DemoVektor{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public DemoVektor(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double lengthVector() {
        double L;
        L = Math.sqrt((x + y + z));
        return L;
    }

    public double scalarProduct(DemoVektor v) {
        double S;
        S = this.x * v.x + this.y * v.y + this.z * v.z;
        return S;
    }

    public DemoVektor vecrtoProdutc(DemoVektor p) {

        double x1 = y * p.z - z * p.y;
        double y1 = z * p.x - x * p.z;
        double z1 = x * p.y - y * p.x;
        DemoVektor v = new DemoVektor(x1, y1, z1);
        return v;
    }

    public double angleVector(DemoVektor v) {
        double R;
        R = scalarProduct(v) / Math.abs(lengthVector()) * Math.abs(v.lengthVector());
        return Math.cos(R);
    }

    public DemoVektor add(DemoVektor v) {
        DemoVektor vektor = new DemoVektor(x + v.x, y + v.y, z + v.z);
        return vektor;
    }

    public DemoVektor minus(DemoVektor v) {
        DemoVektor vektor = new DemoVektor(x - v.x, y - v.y, z - v.z);
        return vektor;
    }

    public static void main(String[] args) {

        DemoVektor vektor = new DemoVektor(1, 1, 1);
        double l = vektor.lengthVector();
        System.out.println(l);

        DemoVektor vektor1 = new DemoVektor(2, 3, 4);
        double o = vektor.scalarProduct(vektor1);
        System.out.println(o);

        DemoVektor k = vektor.vecrtoProdutc(vektor1);
        System.out.println(k);

        double v = vektor.angleVector(vektor1);
        System.out.println(v);

        DemoVektor add = vektor.add(vektor1);
        System.out.println(add);

        DemoVektor min = vektor.minus(vektor1);
        System.out.println(min);


    }
}
