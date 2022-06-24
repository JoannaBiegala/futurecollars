package com.futurecollars.lesson8.textFormatter;

public class ToLowercaseConverter implements TextFormatter {

    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }

}
