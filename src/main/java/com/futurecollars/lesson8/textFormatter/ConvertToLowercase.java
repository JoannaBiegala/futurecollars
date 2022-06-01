package com.futurecollars.lesson8.textFormatter;

public class ConvertToLowercase implements TextFormatter {

    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}
