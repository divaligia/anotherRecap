package org.divaligia.WFigure;

public class Rectangle extends Figure {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 *(length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
