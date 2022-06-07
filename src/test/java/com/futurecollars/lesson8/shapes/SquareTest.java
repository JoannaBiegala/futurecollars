package com.futurecollars.lesson8.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {

    @Test
    void getArea() {
        //given
        double side = 2.0;
        //when
        double shouldBeArea = new Square(side).getArea();
        //then
        Assertions.assertEquals(4.0, shouldBeArea);
    }

    @Test
    void getPerimeter() {
        //given
        double side = 2.0;
        //when
        double shouldBePerimeter = new Square(side).getPerimeter();
        //then
        Assertions.assertEquals(8.0, shouldBePerimeter);
    }
}