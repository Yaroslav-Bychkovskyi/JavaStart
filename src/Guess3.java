public class Guess3 {
    public static void main(String []args) throws java.io.IOException{
        char ch, answer = 'S';
        System.out.println("Задумана буква из диапазона A-Z");
        System.out.print("Попітайтесь ее угадать: ");
        ch = (char) System.in.read();
        if (ch == answer) System.out.println(" ** Правильно! **");
        else {
            System.out.print("...Извините, нужна буква находится ");
            if (ch < answer)
                System.out.println("ближе к концу алфавита");
            else System.out.println("ближе к началу алфавита");
        }
    }
}
