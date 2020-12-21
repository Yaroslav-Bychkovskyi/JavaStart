package TestFile;

import java.util.Locale;

public class UpperCase {
    public static void main(String[] args) {

        FileReader fileReader = new FileReader("test3.txt");
        String s = fileReader.readFile();



        String s1 = "";
        FileWrit fileWrit = new FileWrit("test4.txt");

        s1 = s.toUpperCase();

        fileWrit.fileWriter(s1);
    }
}
