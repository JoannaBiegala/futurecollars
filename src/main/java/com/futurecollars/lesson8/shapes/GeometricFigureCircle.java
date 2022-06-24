package com.futurecollars.lesson8.shapes;

public class GeometricFigureCircle implements GeometricFigure {
    private final double PI = 3.14;
    private final double radius;

    public GeometricFigureCircle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;

    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }
}
