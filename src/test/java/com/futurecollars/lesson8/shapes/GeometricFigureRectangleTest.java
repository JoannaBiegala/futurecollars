package com.futurecollars.lesson8.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class GeometricFigureRectangleTest {
    @Test
    void shouldBeArea() {
        //given
        double width = 2.0;
        double height = 3.0;
        //when
        double expectedArea = new GeometricFigureRectangle(width, height).getArea();
        //then
        Assertions.assertEquals(6.0, expectedArea);
    }

    @Test
    void shouldBePerimeter() {
        //given
        double width = 2.0;
        double height = 3.0;
        //when
        double expectedPerimeter = new GeometricFigureRectangle(width, height).getPerimeter();
        //then
        Assertions.assertEquals(10.0, expectedPerimeter);
    }
}