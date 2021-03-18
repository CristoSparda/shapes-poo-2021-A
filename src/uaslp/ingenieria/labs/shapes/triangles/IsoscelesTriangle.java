package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class IsoscelesTriangle extends Triangle{
    private final int side;
    private final int high; //altura
    private final double base;
    private final double height;//Tamaño de los lados que son iguales

    public IsoscelesTriangle(int side, int base, int height,int high) {
        this.side = side;
        this.base = base;
        this.height = height;
        this.high = high;
    }

    public int getSidesCount(){
        return side;
    }

    public String getName(){
        return "Isosceles Triangle";
    }

    public double getArea(){
        return base*high/2;
    }

    public double getPerimeter(){
        return 2*height+base;
    }

}
