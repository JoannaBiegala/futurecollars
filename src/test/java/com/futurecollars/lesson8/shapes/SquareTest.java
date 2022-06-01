package com.futurecollars.lesson8.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getArea() {
        //given
        double side = 2.0;
        //when
        double area = new Square(side).getArea();
        //then
        Assertions.assertEquals(4.0, area);
    }

    @Test
    void getPerimeter() {
        //given
        double side = 2.0;
        //when
        double perimeter = new Square(side).getPerimeter();
        //then
        Assertions.assertEquals(8.0, perimeter);
    }
}