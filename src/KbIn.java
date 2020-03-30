public class KbIn {
    public static void main(String[]args) throws java.io.IOException{

        char ch;
        System.out.println("Нажмитеп нужную клавішу, а затем клавішу ENTER:");
        ch = (char) System.in.read();
        System.out.println(" Вы нажали клавишу " + ch);
    }
}
