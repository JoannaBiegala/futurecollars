package com.futurecollars.lesson9.text;

import java.util.Scanner;

public class TextChecker {

    boolean hasCharacters(String text) {
        return text != null && !text.isEmpty();
    }

    boolean isPalindrome(String text) {
        for (int index = 0; index < text.length() / 2; index++) {
            if (text.charAt(index) != text.charAt(text.length() - index - 1)) {
                return false;
            }
        }
        return true;
    }

}
