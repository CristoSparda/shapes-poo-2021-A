package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class ScaleneTriangle extends Triangle {
    private final double a,b,c, height;
    private final int side;

    public ScaleneTriangle(int side,double a, double b, double c, double height) {
        this.side = side;
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
    }

    public String getName(){
        return "Scalane Triangle";
    }

    public double getSideA(){
        return a;
    }
    public double getSideB(){
        return b;
    }
    public double getSideC(){
        return c;
    }

    public int getSidesCount(){
        return side;
    }

    public double getArea(){
        return b*height/2; //asumiendo que b es la base
    }

    public double getPerimeter(){
        return a+b+c;
    }


}
