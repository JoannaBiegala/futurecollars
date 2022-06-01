package com.futurecollars.lesson8.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    void getArea() {
        //given
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;
        double height = 4.0;
        //when
        double area = new Triangle(a, b, c, height).getArea();
        //then 6
        Assertions.assertEquals(6.0, area);
    }

    @Test
    void getPerimeter() {
        //given
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;
        double height = 4.0;
        //when
        double perimeter = new Triangle(a, b, c, height).getPerimeter();
        //then
        Assertions.assertEquals(12.0, perimeter);
    }
}