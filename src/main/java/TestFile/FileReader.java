package TestFile;

import java.io.BufferedReader;
import java.io.IOException;


public class FileReader {

    String filename;
    public FileReader(String filename) {
        this.filename = filename;

    }

    public String readFile() {
        String s;
        String result = "";

        try (BufferedReader br = new BufferedReader(new java.io.FileReader(filename))) {
            while ((s = br.readLine()) != null) {
                //System.out.println(s);
                result = result + s + "\n";
            }
        } catch (IOException exc) {
            System.out.println("Помилка ввода - вивода: " + exc);
        }
        return result;
    }
}
