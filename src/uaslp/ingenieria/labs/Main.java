package uaslp.ingenieria.labs;

import uaslp.ingenieria.labs.shapes.*;
import uaslp.ingenieria.labs.shapes.triangles.*;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Shape> shapes = new LinkedList<>();
        //shapes.add(new Shape());
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4,8, 3));
        shapes.add(new Rectangle(4,14, 10));
        shapes.add(new Square(10,4));
        shapes.add(new TriangleEquilatero(3,6));
        shapes.add(new IsoscelesTriangle(3,7,9,5));
        shapes.add(new ScaleneTriangle(3,3,6,9,7));

        for (Shape shape : shapes) {
            System.out.println("Name: " + shape.getName());
            if( shape.getName() == "Circle")
                System.out.println("Radio: " + shape.getRadio());
            if( shape.getName() == "Scalane Triangle" ){
                System.out.println("Lado a: "+shape.getSideA());
                System.out.println("Lado b: "+shape.getSideB());
                System.out.println("Lado c: "+shape.getSideC());
            }
            System.out.println("Sides count: " + shape.getSidesCount());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println("Area: " + shape.getArea());
            System.out.println("-----------------------------------------------");
        }


    }
}
