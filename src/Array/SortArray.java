package Array;

import java.util.ArrayList;
import java.util.List;

class SortArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 43, 54, 67, 32, 6, 5};
        int[] b = {1, 3, 4, 43, 32, 6, 453, 54, 65};
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.println(a[i] + " " + b[j]);
                    result.add(a[i]);
                }
            }
        }
        System.out.println(result);
    }
}

