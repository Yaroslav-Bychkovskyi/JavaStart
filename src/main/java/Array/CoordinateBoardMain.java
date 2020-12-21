package Array;

public class CoordinateBoardMain {
    public static void main(String[] args) {
        CoordinateBoard coordinateBoard = new CoordinateBoard(-10, 10, -10, 10);
        CoordinateBoard coordinateBoard2 = new CoordinateBoard(-50, 50, -50, 50);

        VectorMain vectorMain = new VectorMain();

        for (int i = 0; i < vectorMain.mas.length; i++) {
            if (coordinateBoard.contains(vectorMain.mas[i])){
                System.out.println(vectorMain.mas[i]);

            }
            if (coordinateBoard2.contains(vectorMain.mas[i])){
                System.out.println(vectorMain.mas[i]);
            }
        }
    }
}
