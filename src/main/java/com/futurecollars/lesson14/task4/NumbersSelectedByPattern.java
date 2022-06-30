package com.futurecollars.lesson14.task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumbersSelectedByPattern {

    private static final String DATA_PATH = "src/main/java/com/futurecollars/lesson14/task4/data.txt";
    Map<String, String> patterns;
    List<String> numbers = new ArrayList<>();

    public NumbersSelectedByPattern(Map<String, String> patterns) {
        this.patterns = patterns;
    }

    public void validateNumbers() {
        String numbersByPattern;
        for (Map.Entry<String, String> pattern : patterns.entrySet()) {
            Pattern REGEX = Pattern.compile(pattern.getValue());
            numbersByPattern = pattern.getKey();
            for (String number : numbers) {
                Matcher matcher = REGEX.matcher(number);
                if (matcher.matches()) {
                    numbersByPattern += matcher.group() + ',';

                }
            }
            System.out.println(numbersByPattern.substring(0, numbersByPattern.length() - 1));
        }

    }

    public void readNumbersFromFile() {
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(DATA_PATH))) {
            while ((line = reader.readLine()) != null) {
                if (!line.isEmpty()) {
                    numbers.add(line);
                }
            }
        } catch (IOException ioex) {
            System.err.println("Could not load numbers");
        }
    }

}

