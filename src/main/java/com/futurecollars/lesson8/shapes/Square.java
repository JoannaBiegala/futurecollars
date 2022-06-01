package com.futurecollars.lesson8.shapes;

public class Square extends Rectangle {
    double side;
    double width;
    double height;

    public Square(double side) {
        super(side, side);   // width == height
        this.side = side;
        this.width = side;
        this.height = side;
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public double getArea() {
        return super.getArea();
    }
}
