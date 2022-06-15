package com.futurecollars.lesson7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertMinutesToSecondsTest {
    @Test
    void shouldConvertMinutesToSecondsCorrectly1() {
        //given
        int minutes2 = 2;
        //when
        int seconds = ConvertMinutesToSeconds.getSecondsFromGivenMinutes(minutes2);
        //then
        assertEquals(120, seconds);
    }

    @Test
    void shouldConvertMinutesToSecondsCorrectly2() {
        //given
        int minutes2 = 4;
        //when
        int seconds = ConvertMinutesToSeconds.getSecondsFromGivenMinutes(minutes2);
        //then
        assertEquals(240, seconds);
    }


}