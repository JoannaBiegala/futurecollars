package com.futurecollars.lesson14.task4;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumbersValidator {

    private final static String PATTERN_INTEGER = "\\d+";
    private final static String PATTERN_FLOAT = "\\d+[.]+\\d+";
    private final static String PATTERN_SCIENTIFIC = "\\d+[.]+\\d+\\D+\\d+";

    public void validateNumbersByPatternsInteger(List<String> numbers) {
        String numbersByPattern = "";
        Pattern regex = Pattern.compile(PATTERN_INTEGER);
        for (String number : numbers) {
            Matcher matcher = regex.matcher(number);
            if (matcher.matches()) {
                numbersByPattern += matcher.group() + ',';
            }
        }
        System.out.println("Integers: " + numbersByPattern);
    }

    public void validateNumbersByPatternsFloat(List<String> numbers) {
        String numbersByPattern = "";
        Pattern regex = Pattern.compile(PATTERN_FLOAT);
        for (String number : numbers) {
            Matcher matcher = regex.matcher(number);
            if (matcher.matches()) {
                numbersByPattern += matcher.group() + ',';
            }
        }
        System.out.println("Floats: " + numbersByPattern);
    }

    public void validateNumbersByPatternsScientific(List<String> numbers) {
        String numbersByPattern = "";
        Pattern regex = Pattern.compile(PATTERN_SCIENTIFIC);
        for (String number : numbers) {
            Matcher matcher = regex.matcher(number);
            if (matcher.matches()) {
                numbersByPattern += matcher.group() + ',';
            }
        }
        System.out.println("Numbers in scientific notation: " + numbersByPattern);
    }

}
