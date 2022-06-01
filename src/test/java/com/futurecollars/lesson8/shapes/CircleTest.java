package com.futurecollars.lesson8.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircleTest {

    @Test
    void getArea() {
        //given
        double radius = 2.0;
        //when
        double area = new Circle(radius).getArea();
        //then
        Assertions.assertEquals(12.56, area);
    }

    @Test
    void getPerimeter() {
        //given
        double radius = 2.0;
        //when
        double perimeter = new Circle(radius).getPerimeter();
        //then
        Assertions.assertEquals(12.56, perimeter);
    }
}