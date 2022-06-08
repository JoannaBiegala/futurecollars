package com.futurecollars.lesson9.text;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextCheckingTest {

    @Test
    void hasTextCharacters() {
        //given
        String text = "ABBA";
        //when
        boolean shouldBeContainingCharacters = TextChecking.hasTextCharacters(text);
        //then
        assertTrue(shouldBeContainingCharacters);
    }

    @Test
    void textIsPalindrome() {
        //given
        String text = "ABRBA";
        //when
        boolean shouldBePalindrome = TextChecking.isTextPalindrome(text);
        //then
        assertTrue(shouldBePalindrome);
    }

    @Test
    void textIsNotPalindrome() {
        //given
        String text = "ABRQBA";
        //when
        boolean shouldBeNotPalindrome = TextChecking.isTextPalindrome(text);
        //then
        assertFalse(shouldBeNotPalindrome);
    }

    @Test
    void getLengthOfText() {
        //given
        String text = "ABBA";
        //when
        int shouldBeLengthOfText = TextChecking.getLengthOfText(text);
        //then
        assertEquals(4, shouldBeLengthOfText);
    }

}
