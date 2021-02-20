package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        Shape rectangle = new Rectangle(Color.valueOf("BLACK"), 4.0, 5.0);
        Shape circle = new Circle(Color.valueOf("RED"), 3.0);

        shapes.add(rectangle);
        shapes.add(circle);

        System.out.println("SHAPE AREAS: ");
        for (Shape shape: shapes) {
            System.out.println(String.format("%.2f", shape.area()));
        }

    }
}
