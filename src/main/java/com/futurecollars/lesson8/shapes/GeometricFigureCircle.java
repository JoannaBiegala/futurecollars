package com.futurecollars.lesson8.shapes;

public class GeometricFigureCircle implements GeometricFigure {
    private final double pi = 3.14;
    double radius;

    public GeometricFigureCircle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * pi * radius;

    }

    @Override
    public double getArea() {
        return pi * radius * radius;
    }
}
