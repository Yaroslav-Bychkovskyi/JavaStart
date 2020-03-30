import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws java.io.IOException {

        String line = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть с:");
        double c = 0;

        do {
            if (sc.hasNext()) {
                line = sc.next();

                if (isNumeric(line)) {
                    c = Double.parseDouble(line);
                    System.out.println("Введено число c = " + c);
                    break;
                } else {
                    System.out.println("Введено не число c");
                }
            }

        } while (true);

        System.out.println("Ура");

    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}

