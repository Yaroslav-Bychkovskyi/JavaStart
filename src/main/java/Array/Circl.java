package Array;

public class Circl implements Comparable<Circl> {
    public int r;

    public Circl(int r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circl{" +
                "r=" + r +
                '}';
    }

    @Override
    public int compareTo(Circl o) {
        if (this.r > o.r) {
            return 1;
        }
        if (this.r < o.r) {
            return -1;
        }
        return 0;
    }
}
