package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Circle extends Shape {
    private final double radio;
    private final double pi = 3.1416;


    public Circle(int radio) {
        this.radio = radio;
    }

    public String getName() {
        return "Circle";
    }

    public double getRadio() {
        return radio;
    }

    public double getPerimeter(){
        return (2*pi*radio);
    }

    public double getArea(){
        return pi * Math.pow(radio,2);
    }

}
