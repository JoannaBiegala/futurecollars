package com.futurecollars.lesson8.textFormatter;

public class ConvertToUppercase implements TextFormatter {

    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
