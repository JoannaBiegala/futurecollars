package com.futurecollars.lesson8.textFormatter;

public class ToUppercaseConverter implements TextFormatter {

    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }

}
