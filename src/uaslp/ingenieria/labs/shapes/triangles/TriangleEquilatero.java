package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class TriangleEquilatero extends Triangle {
    private final int sides;
    private final double side;

    public TriangleEquilatero(int sides, double side) {
        this.sides = sides;
        this.side = side;

    }

    public String getName(){
        return "Triangulo Equilatero";
    }

    public int getSidesCount(){
        return sides;
    }

    public double getArea(){
        return  Math.sqrt(3)*Math.pow(side,2)/4;
    }

    public double getPerimeter(){
        return 3*side;
    }

}
