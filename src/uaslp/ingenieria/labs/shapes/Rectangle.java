package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Rectangle extends Shape {

    private final int base;
    private final int height;
    private final int side;

    public Rectangle(int side,int base, int height) {
        this.side = side;
        this.base = base;
        this.height = height;
    }

    public int getSidesCount(){
        return side;
    }

    public String getName() {
        return "Rectangle";
    }

    public double getPerimeter(){
        return (base*2+height*2);
    }

    public double getArea() {
        return base * height;
    }

}
