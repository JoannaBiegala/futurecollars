package com.futurecollars.lesson11.bigLetters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

class UppercaseConverterTest {

    @ParameterizedTest
    @ValueSource(strings = {"Ala ma kota"})
    void shouldBeUppercaseText(String text) {
        //when
        String uppercaseText = new UppercaseConverter().convertToUppercase(text);
        //then
        Assertions.assertEquals("ALA MA KOTA", uppercaseText);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void shouldBeBlank(String text) {
        //when
        String blank = new UppercaseConverter().convertToUppercase(text);
        //then
        Assertions.assertEquals("", blank);
    }

}