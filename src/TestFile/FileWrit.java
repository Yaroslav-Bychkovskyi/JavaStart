package TestFile;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrit {
    String fileN;

    public FileWrit(String fileN) {
        this.fileN = fileN;
    }

  public void fileWriter(String cont) {

        try (FileWriter fw = new FileWriter(fileN)) {

            fw.write(cont);

        } catch (IOException exc) {
            System.out.println("Помилка ввода - вивода: " + exc);
        }
    }
}
