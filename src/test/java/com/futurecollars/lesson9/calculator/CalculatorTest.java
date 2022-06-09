package com.futurecollars.lesson9.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void shouldBeSum() {
        //given
        int option = 1;
        int[] numbers = {2, 3, 4, 5};
        //when
        String shouldBeSum = new Calculator().runCalculator(option, numbers);
        //then
        Assertions.assertEquals("14", shouldBeSum);
    }

    @Test
    void shouldBeDifference() {
        //given
        int option = 2;
        int[] numbers = {12, 3, 4};
        //when
        String shouldBeDifference = new Calculator().runCalculator(option, numbers);
        //then
        Assertions.assertEquals("5", shouldBeDifference);
    }

    @Test
    void shouldBeProduct() {
        //given
        int option = 3;
        int[] numbers = {2, 3};
        //when
        String shouldBeProduct = new Calculator().runCalculator(option, numbers);
        //then
        Assertions.assertEquals("6", shouldBeProduct);
    }

    @Test
    void shouldBeQuotient() {
        //given
        int option = 4;
        int[] numbers = {12, 3, 2};
        //when
        String shouldBeQuotient = new Calculator().runCalculator(option, numbers);
        //then
        Assertions.assertEquals("2", shouldBeQuotient);
    }

    @Test
    void shouldBeWrongOption() {
        //given
        int option = 7;
        int[] numbers = {12, 3, 2};
        //when
        String shouldBeQuotient = new Calculator().runCalculator(option, numbers);
        //then
        Assertions.assertEquals("Option entered incorrectly", shouldBeQuotient);
    }
}