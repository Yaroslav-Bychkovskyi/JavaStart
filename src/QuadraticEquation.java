import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) throws java.io.IOException {

        double a;
        double b;
        double c;
        String line = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть а:");
        do {
            if (sc.hasNext()) {
                line = sc.next();

                if (isNumeric(line)) {
                    a = Double.parseDouble(line);
                    if (a == 0) {
                        System.out.println("Помилка а != 0");
                    } else {
                        System.out.println("Введено число a = " + a);
                        break;
                    }
                } else {
                    System.out.println("Введено не число a");
                }
            }

        } while (true);

        System.out.println("Введіть b:");
        do {
            if (sc.hasNext()) {
                line = sc.next();

                if (isNumeric(line)) {
                    b = Double.parseDouble(line);
                    System.out.println("Введено число b = " + b);
                    break;
                } else {
                    System.out.println("Введено не число b");
                }
            }

        } while (true);
        System.out.println("Введіть c:");
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

        System.out.println("Квадратне рівняння \n" + a + "*x1^2 + " + b + "*x2 + " + c + " = 0");

        QuadEquation v = new QuadEquation(a , b, c);
        System.out.println(v.result());


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
