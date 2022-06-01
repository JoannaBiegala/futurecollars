package com.futurecollars.lesson8.shapes;

public class Circle extends Shape {
    private final double pi = 3.14;
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return pi * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * pi * radius;
    }
}
