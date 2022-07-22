package com.futurecollars.lesson11.numbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EvenCheckerTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 12})
    void shouldBeEven(int number) {
        //when
        boolean expectTrue = new EvenChecker().isEven(number);
        //then
        assertTrue(expectTrue);
    }

    @ParameterizedTest
    @ValueSource(ints = {21, 43, 121})
    void shouldBeOdd(int number) {
        //when
        boolean expectFalse = new EvenChecker().isEven(number);
        //then
        assertFalse(expectFalse);
    }

}