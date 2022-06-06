package com.futurecollars.lesson8.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GeometricFigureCircleTest {

    @Test
    void getArea() {
        //given
        double radius = 2.0;
        //when
        double shouldBeArea = new GeometricFigureCircle(radius).getArea();
        //then
        Assertions.assertEquals(12.56, shouldBeArea);
    }

    @Test
    void getPerimeter() {
        //given
        double radius = 2.0;
        //when
        double shouldBePerimeter = new GeometricFigureCircle(radius).getPerimeter();
        //then
        Assertions.assertEquals(12.56, shouldBePerimeter);
    }
}