package TestFile;

import com.github.yb.section1_5.Bubble;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestFile {
    public static void main(String[] args) {
        String s;
        List<String> list = new ArrayList<>();


        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
                list.add(s);
            }
        } catch (IOException exc) {
            System.out.println("Помилка ввода - вивода: " + exc);
        }
        System.out.println(list);

        int [] b = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            int c = Integer.parseInt(list.get(i));
            b[i] = c;
        }

        System.out.println(Arrays.toString(b));
        Bubble.sort(b);
        System.out.println(Arrays.toString(b));

        try (FileWriter fw = new FileWriter("test2.txt")){

            for (int i = 0; i < b.length; i++) {

                  fw.write(b[i] +"");
                  fw.write("\n");

            }
        }  catch (IOException exc) {
            System.out.println("Помилка ввода - вивода: " + exc);
        }

    }
}

