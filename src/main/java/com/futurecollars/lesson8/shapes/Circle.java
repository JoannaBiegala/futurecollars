package com.futurecollars.lesson8.shapes;

public class Circle extends Shape {
    private final static double PI = 3.14;
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }
}
