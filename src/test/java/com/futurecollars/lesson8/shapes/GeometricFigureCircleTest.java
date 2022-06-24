package com.futurecollars.lesson8.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GeometricFigureCircleTest {

    @Test
    void shouldBeArea() {
        //given
        double radius = 2.0;
        //when
        double expectedArea = new GeometricFigureCircle(radius).getArea();
        //then
        Assertions.assertEquals(12.56, expectedArea);
    }

    @Test
    void shouldBePerimeter() {
        //given
        double radius = 2.0;
        //when
        double expectedPerimeter = new GeometricFigureCircle(radius).getPerimeter();
        //then
        Assertions.assertEquals(12.56, expectedPerimeter);
    }
}