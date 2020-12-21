package Imitation;

import java.util.ArrayList;
import java.util.List;

public class FigureMain {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();

        Rectangle rectangle = new Rectangle(4, 5);
        Circle circle = new Circle(10);
        Square square = new Square(7);
        Triangle triangle = new Triangle(6, 9, 7);

        figures.add(rectangle);
        figures.add(circle);
        figures.add(square);
        figures.add(triangle);

        System.out.println(figures);


        System.out.println("Площа - " + rectangle.square());
        System.out.println("Площа - " + triangle.square());
    }
}
