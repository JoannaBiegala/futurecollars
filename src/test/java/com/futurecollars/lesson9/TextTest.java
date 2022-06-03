package com.futurecollars.lesson9;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextTest {

    @Test
    void getPalindromeLengthShouldBeFour() {
        //given
        String text = "ABBA";

        //when
        int lengthOfText = new Text().getPalindromeLength(text);

        //then
        assertEquals(4, lengthOfText);

    }


    @Test
    void getPalindromeLengthShouldBeFive() {
        //given
        String text = "ABRBA";

        //when
        int lengthOfText = new Text().getPalindromeLength(text);

        //then
        assertEquals(5, lengthOfText);

    }

    @Test
    void getPalindromeLengthShouldBeZero() {
        //given
        String text = "ABRQBA";

        //when
        int lengthOfText = new Text().getPalindromeLength(text);

        //then
        assertEquals(0, lengthOfText);

    }

}