package com.futurecollars.lesson7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinutesToSecondsConverterTest {
    @Test
    void shouldConvertMinutesToSecondsCorrectly() {
        //given
        int minutes = 2;
        //when
        int seconds = MinutesToSecondsConverter.getSecondsFromGivenMinutes(minutes);
        //then
        assertEquals(120, seconds);
    }

}