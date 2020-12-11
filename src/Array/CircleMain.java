package Array;

import java.util.Arrays;

public class CircleMain {
    public static void main(String[] args) {

        Circl c1 = new Circl(1252);
        Circl c2 = new Circl(2);
        Circl c3 = new Circl(15);
        Circl c4 = new Circl(7);
        Circl c5 = new Circl(96);

        Circl[] kolo = {c1, c2, c3, c4, c5};

        System.out.println(" Виведення - " + Arrays.toString(kolo));
        Arrays.sort(kolo);
        System.out.println(" Виведення - " + Arrays.toString(kolo));

    }
}
