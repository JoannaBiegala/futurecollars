package com.futurecollars.lesson8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void testToString() {
        //given
        double width = 12.0;
        double height = 8.0;
        //when
        String shouldBeInformationOfTriangle = new Triangle(width, height).toString();
        //then
        assertEquals("Triangle{width=12.0, height=8.0}", shouldBeInformationOfTriangle);
    }

}