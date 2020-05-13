package org.divaligia.WFigure;

public class Circle extends Figure{
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2*radius*3.14159;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
