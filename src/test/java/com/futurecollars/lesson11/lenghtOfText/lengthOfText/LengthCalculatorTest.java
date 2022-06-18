package com.futurecollars.lesson11.lenghtOfText.lengthOfText;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LengthCalculatorTest {

    @ParameterizedTest
    @CsvSource(value = {"Ala:3", "Kotek:5", ":0"}, delimiter = ':')
    void shouldBeLengthOfText(String text, int expected) {
        //when
        int lengthOfText = new LengthCalculator().getLengthOfText(text);
        //then
        Assertions.assertEquals(expected, lengthOfText);

    }

}