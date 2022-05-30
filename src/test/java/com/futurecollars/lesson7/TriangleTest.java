package com.futurecollars.lesson7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    void shouldBeTriangleRectangular() {
        //given
        int a = 3;
        int b = 4;
        int c = 5;
        //when
        boolean shouldBeTrue = Triangle.isTriangleRectangular(a, b, c);
        //then
        Assertions.assertTrue(shouldBeTrue);


    }

    @Test
    void shouldBeTriangleNotRectangular() {
        //given
        int a = 2;
        int b = 4;
        int c = 5;
        //when
        boolean shouldBeFalse = Triangle.isTriangleRectangular(a, b, c);
        //then
        Assertions.assertFalse(shouldBeFalse);


    }

}