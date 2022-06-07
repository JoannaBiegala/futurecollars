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
        double shouldBeArea = new Triangle(a, b, c, height).getArea();
        //then 6
        Assertions.assertEquals(6.0, shouldBeArea);
    }

    @Test
    void getPerimeter() {
        //given
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;
        double height = 4.0;
        //when
        double shouldBePerimeter = new Triangle(a, b, c, height).getPerimeter();
        //then
        Assertions.assertEquals(12.0, shouldBePerimeter);
    }
}