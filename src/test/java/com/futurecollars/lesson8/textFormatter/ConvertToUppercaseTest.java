package com.futurecollars.lesson8.textFormatter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConvertToUppercaseTest {

    @Test
    void formatText() {
        //given
        String text = "Ala ma kota";
        //when
        String expectUppercaseTest = new ConvertToUppercase().formatText(text);
        //then
        Assertions.assertEquals("ALA MA KOTA", expectUppercaseTest);
    }
}