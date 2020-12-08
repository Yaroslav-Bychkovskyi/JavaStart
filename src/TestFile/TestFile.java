package TestFile;

import com.github.yb.section1_5.Bubble;

import java.util.Arrays;

public class TestFile {
    public static void main(String[] args) {

        FileReader fileReader = new FileReader("test.txt");

        String s = fileReader.readFile();
        String[] split = s.split("\n");

        int[] b = new int[split.length];

        for (int i = 0; i < split.length; i++) {
            int c = Integer.parseInt(split[i]);
            b[i] = c;

        }


        System.out.println(Arrays.toString(b));
        Bubble.sort(b);
        System.out.println(Arrays.toString(b));

        String s1 = "";
        FileWrit fileWrit = new FileWrit("test2.txt");

        for (int i = 0; i < b.length; i++) {
            if (b[i] > 100) {
                s1 = s1 + b[i] +"\n";

            }

        }
        fileWrit.fileWriter(s1);
    }
}


