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
        boolean shouldBeRectangular = Triangle.isRectangular(a, b, c);
        //then
        Assertions.assertTrue(shouldBeRectangular);

    }

    @Test
    void shouldBeTriangleNotRectangular() {
        //given
        int a = 2;
        int b = 4;
        int c = 5;
        //when
        boolean shouldBeNotRectangular = Triangle.isRectangular(a, b, c);
        //then
        Assertions.assertFalse(shouldBeNotRectangular);

    }

}