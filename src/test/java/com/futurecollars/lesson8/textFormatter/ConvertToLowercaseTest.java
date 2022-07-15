package com.futurecollars.lesson8.textFormatter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConvertToLowercaseTest {

    @Test
    void shouldBeLowercaseTest() {
        //given
        String text = "Ala ma kota";
        //when
        String expectedLowercaseTest = new ToLowercaseConverter().formatText(text);
        //then
        Assertions.assertEquals("ala ma kota", expectedLowercaseTest);
    }

}