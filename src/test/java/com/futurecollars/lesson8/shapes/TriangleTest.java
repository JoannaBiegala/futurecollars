package com.futurecollars.lesson8.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    void shouldBeArea() {
        //given
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;
        double height = 4.0;
        //when
        double expectedArea = new Triangle(a, b, c, height).getArea();
        //then 6
        Assertions.assertEquals(6.0, expectedArea);
    }

    @Test
    void shouldBePerimeter() {
        //given
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;
        double height = 4.0;
        //when
        double expectedPerimeter = new Triangle(a, b, c, height).getPerimeter();
        //then
        Assertions.assertEquals(12.0, expectedPerimeter);
    }
}