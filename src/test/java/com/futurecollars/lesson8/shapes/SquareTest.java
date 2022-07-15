package com.futurecollars.lesson8.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {

    @Test
    void shouldBeArea() {
        //given
        double side = 2.0;
        //when
        double expectedArea = new Square(side).getArea();
        //then
        Assertions.assertEquals(4.0, expectedArea);
    }

    @Test
    void shouldBePerimeter() {
        //given
        double side = 2.0;
        //when
        double expectedPerimeter = new Square(side).getPerimeter();
        //then
        Assertions.assertEquals(8.0, expectedPerimeter);
    }

}