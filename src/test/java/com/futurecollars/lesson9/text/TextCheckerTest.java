package com.futurecollars.lesson9.text;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextCheckerTest {

    @Test
    void shouldBeContainingCharacters() {
        //given
        String text = "ABBA";
        //when
        boolean shouldBeContainingCharacters = new TextChecker().hasCharacters(text);
        //then
        assertTrue(shouldBeContainingCharacters);
    }

    @Test
    void shouldBePalindrome() {
        //given
        String text = "ABRBA";
        //when
        boolean shouldBePalindrome = new TextChecker().isPalindrome(text);
        //then
        assertTrue(shouldBePalindrome);
    }

    @Test
    void shouldBeNotPalindrome() {
        //given
        String text = "ABRQBA";
        //when
        boolean shouldBeNotPalindrome =  new TextChecker().isPalindrome(text);
        //then
        assertFalse(shouldBeNotPalindrome);
    }


}
