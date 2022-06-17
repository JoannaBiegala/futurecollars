package com.futurecollars.lesson9.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void shouldBeSum() {
        //given
        Operation addition = new Addition();
        int[] numbers = {2, 3, 4, 5};
        //when
        int shouldBeSum = new Calculator().runCalculator(addition, numbers);
        //then
        Assertions.assertEquals(14, shouldBeSum);
    }

    @Test
    void shouldBeDifference() {
        //given
        Operation subtraction = new Subtraction();
        int[] numbers = {12, 3, 4};
        //when
        int shouldBeDifference = new Calculator().runCalculator(subtraction, numbers);
        //then
        Assertions.assertEquals(5, shouldBeDifference);
    }

    @Test
    void shouldBeProduct() {
        //given
        Operation multiplication = new Multiplication();
        int[] numbers = {2, 3};
        //when
        int shouldBeProduct = new Calculator().runCalculator(multiplication, numbers);
        //then
        Assertions.assertEquals(6, shouldBeProduct);
    }

    @Test
    void shouldBeQuotient() {
        //given
        Operation division = new Division();
        int[] numbers = {12, 3, 2};
        //when
        int shouldBeQuotient = new Calculator().runCalculator(division, numbers);
        //then
        Assertions.assertEquals(2, shouldBeQuotient);
    }

}