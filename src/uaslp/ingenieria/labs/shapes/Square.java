package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Square extends Shape {
    private int side;
    private int sides;

    public Square(int side,int sides) {
        this.side = side;
        this.sides = sides;

    }

    public int getSidesCount(){
        return sides;
    }

    public String getName() {
        return "Square";
    }

    public double getPerimeter() {
        return side * 4;
    }

    public double getArea(){
        return side*side;
    }

}
