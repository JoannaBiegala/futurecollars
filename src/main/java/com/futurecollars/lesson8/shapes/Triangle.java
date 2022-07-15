package com.futurecollars.lesson8.shapes;

public class Triangle extends Shape {
    // a,b,c -  the sides of the triangle
    private final double a;
    private final double b;
    private final double c;
    private final double height;

    public Triangle(double a, double b, double c, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 1 / 2.0 * a * height;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}
