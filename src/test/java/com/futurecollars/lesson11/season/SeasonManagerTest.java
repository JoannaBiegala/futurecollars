package com.futurecollars.lesson11.season;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.time.Month;

class SeasonManagerTest {

    @ParameterizedTest
    @EnumSource(value = Month.class,
            names = {"SEPTEMBER", "OCTOBER", "NOVEMBER"})
    void shouldBeAUTUMN(Month names) {
        //when
        Season season = new SeasonManager().getSeason(names);
        //then
        Assertions.assertEquals(Season.AUTUMN, season);
    }

    @ParameterizedTest
    @EnumSource(value = Month.class,
            names = {"DECEMBER", "JANUARY", "FEBRUARY"})
    void shouldBeWINTER(Month names) {
        //when
        Season season = new SeasonManager().getSeason(names);
        //then
        Assertions.assertEquals(Season.WINTER, season);
    }

    @ParameterizedTest
    @EnumSource(value = Month.class,
            names = {"MARCH", "APRIL", "MAY"})
    void shouldBeSPRING(Month names) {
        //when
        Season season = new SeasonManager().getSeason(names);
        //then
        Assertions.assertEquals(Season.SPRING, season);
    }

    @ParameterizedTest
    @EnumSource(value = Month.class,
            names = {"JUNE", "JULY", "AUGUST"})
    void shouldBeSUMMER(Month names) {
        //when
        Season season = new SeasonManager().getSeason(names);
        //then
        Assertions.assertEquals(Season.SUMMER, season);
    }

}