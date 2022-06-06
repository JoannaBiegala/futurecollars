package com.futurecollars.lesson8.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class GeometricFigureRectangleTest {
    @Test
    void getArea() {
        //given
        double width = 2.0;
        double height = 3.0;
        //when
        double shouldBeArea = new GeometricFigureRectangle(width, height).getArea();
        //then
        Assertions.assertEquals(6.0, shouldBeArea);
    }

    @Test
    void getPerimeter() {
        //given
        double width = 2.0;
        double height = 3.0;
        //when
        double shouldBePerimeter = new GeometricFigureRectangle(width, height).getPerimeter();
        //then
        Assertions.assertEquals(10.0, shouldBePerimeter);
    }
}