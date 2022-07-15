package com.futurecollars.lesson8.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircleTest {

    @Test
    void shouldBeArea() {
        //given
        double radius = 2.0;
        //when
        double expectedArea = new Circle(radius).getArea();
        //then
        Assertions.assertEquals(12.56, expectedArea);
    }

    @Test
    void shouldBePerimeter() {
        //given
        double radius = 2.0;
        //when
        double expectedPerimeter = new Circle(radius).getPerimeter();
        //then
        Assertions.assertEquals(12.56, expectedPerimeter);
    }

}