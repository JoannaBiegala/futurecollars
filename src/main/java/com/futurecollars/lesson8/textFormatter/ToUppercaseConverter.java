package com.futurecollars.lesson8.textFormatter;

public class ToUppercaseConverter implements TextFormatter {

    @Override
    public String formatText(String text) {
        if (text == null) {
            throw new IllegalArgumentException("The text you want to format is null");
        }
        return text.toUpperCase();
    }

}
