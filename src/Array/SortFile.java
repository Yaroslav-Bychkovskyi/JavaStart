package Array;

import TestFile.FileReader;
import com.github.yb.section1_5.Bubble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortFile {


    public static void main(String[] args) {
        FileReader fileReader = new FileReader("b.txt");

        String s = fileReader.readFile()
                .replaceAll(" ", "")
                .replaceAll("\n", "");

        String[] split = s.split(",");
        int[] a = new int[split.length];

        for (int i = 0; i < split.length; i++) {
            int c = Integer.parseInt(split[i]);
            a[i] = c;

        }
        System.out.println(Arrays.toString(a));

        FileReader fileRead = new FileReader("a.txt");

        String s1 = fileRead.readFile()
                .replaceAll(" ", "")
                .replaceAll("\n", "");

        String[] spl = s1.split(",");
        int[] b = new int[spl.length];

        for (int j = 0; j < spl.length; j++) {
            int v = Integer.parseInt(spl[j]);
            b[j] = v;

        }
        System.out.println(Arrays.toString(b));

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
           for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
        //            System.out.println(a[i] + " " +b[j] );
                    result.add(a[i]);
                }

            }
        }
        System.out.println(result);

    }
}
