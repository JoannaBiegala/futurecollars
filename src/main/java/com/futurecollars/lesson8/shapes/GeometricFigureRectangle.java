package com.futurecollars.lesson8.shapes;

public class GeometricFigureRectangle implements GeometricFigure {
    private final double width;
    private final double height;

    public GeometricFigureRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * height;
    }
}
