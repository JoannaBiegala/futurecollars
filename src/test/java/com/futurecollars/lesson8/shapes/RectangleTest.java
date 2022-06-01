package com.futurecollars.lesson8.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectangleTest {

    @Test
    void getArea() {
        //given
        double width = 2.0;
        double height = 3.0;
        //when
        double area = new Rectangle(width, height).getArea();
        //then
        Assertions.assertEquals(6.0, area);
    }

    @Test
    void getPerimeter() {
        //given
        double width = 2.0;
        double height = 3.0;
        //when
        double perimeter = new Rectangle(width, height).getPerimeter();
        //then
        Assertions.assertEquals(10.0, perimeter);
    }
}