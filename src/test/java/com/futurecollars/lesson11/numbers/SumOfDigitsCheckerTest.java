package com.futurecollars.lesson11.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SumOfDigitsCheckerTest {

    @ParameterizedTest
    @CsvSource(value = {"23:5", "44:8", "312:6"}, delimiter = ':')
    void shouldBeSumOfDigits(int number, int expected) {
        //when
        int sumOfDigits = new SumOfDigitsCounter().addDigitsOfNumber(number);
        //then
        Assertions.assertEquals(expected, sumOfDigits);
    }

}