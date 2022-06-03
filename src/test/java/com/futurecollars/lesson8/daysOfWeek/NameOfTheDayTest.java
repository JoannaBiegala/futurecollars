package com.futurecollars.lesson8.daysOfWeek;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class NameOfTheDayTest {

    @Test
    void formatText() {
        //given
        DaysOfWeek sunday = DaysOfWeek.valueOf("Sunday");
        //when
        String expectSunday = new NameOfTheDay().getNameOfTheDay(sunday);
        //then
        Assertions.assertEquals("Sunday", expectSunday);
    }
}