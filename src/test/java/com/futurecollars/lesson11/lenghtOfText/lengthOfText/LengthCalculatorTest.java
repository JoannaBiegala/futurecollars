package com.futurecollars.lesson11.lenghtOfText.lengthOfText;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class LengthCalculatorTest {

    @ParameterizedTest(name = "text: \"{0}\", length: {1}")
    @MethodSource(value = "getParams")
    void shouldBeLengthOfText(String text, int expected) {
        //when
        int lengthOfText = new LengthCalculator().getLengthOfText(text);
        //then
        Assertions.assertEquals(expected, lengthOfText);

    }

    private static Stream<Arguments> getParams() {
        return Stream.of(
                Arguments.of("Ala", 3),
                Arguments.of("Kotek", 5),
                Arguments.of("", 0),
                Arguments.of(null, 0)
        );
    }


}