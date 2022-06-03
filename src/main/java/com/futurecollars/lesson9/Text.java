package com.futurecollars.lesson9;

public class Text {

    int getPalindromeLength(String text) {

        boolean isCorrect = true;
        if (text.length() > 0) {
            for (int i = 0; i < text.length() / 2; i++) {
                if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
                    isCorrect = false;
                    break;
                }
            }
        }
        return isCorrect ? text.length() : 0;
    }

}
