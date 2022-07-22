package com.futurecollars.lesson14.task4;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumbersValidator {

    private final static String PATTERN_INTEGER = "\\d+";
    private final static String PATTERN_FLOAT = "\\d+[.]+\\d+";
    private final static String PATTERN_SCIENTIFIC = "\\d+[.]+\\d+\\D+\\d+";

    public void validateNumbersByPatternsInteger(List<String> numbers) {
        System.out.println("Integers: " + validateNumbersByPattern(numbers, PATTERN_INTEGER));
    }

    public void validateNumbersByPatternsFloat(List<String> numbers) {
        System.out.println("Floats: " + validateNumbersByPattern(numbers, PATTERN_FLOAT));
    }

    public void validateNumbersByPatternsScientific(List<String> numbers) {
        System.out.println("Numbers in scientific notation: " + validateNumbersByPattern(numbers, PATTERN_SCIENTIFIC));
    }

    public String validateNumbersByPattern(List<String> numbers, String pattern) {
        String numbersByPattern = "";
        Pattern regex = Pattern.compile(pattern);
        for (String number : numbers) {
            Matcher matcher = regex.matcher(number);
            if (matcher.matches()) {
                numbersByPattern += matcher.group() + ',';
            }
        }
        return numbersByPattern;
    }

}
