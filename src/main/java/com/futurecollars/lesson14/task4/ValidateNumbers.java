package com.futurecollars.lesson14.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNumbers {

    Map<String, String> patterns;
    List<String> numbers = new ArrayList<>();

    public ValidateNumbers (Map<String, String> patterns) {
        this.patterns = patterns;
        ReadNumbers.readNumbersFromFile(numbers);
    }

    public void validateNumbersByPatterns() {
        String numbersByPattern;
        for (Map.Entry<String, String> pattern : patterns.entrySet()) {
            Pattern regex = Pattern.compile(pattern.getValue());
            numbersByPattern = pattern.getKey();
            for (String number : numbers) {
                Matcher matcher = regex.matcher(number);
                if (matcher.matches()) {
                    numbersByPattern += matcher.group() + ',';
                }
            }
            System.out.println(numbersByPattern.substring(0, numbersByPattern.length() - 1));
        }
    }

}
