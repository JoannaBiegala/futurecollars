package com.futurecollars.lesson14.task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NumbersReader {

    private static final String DATA_PATH = "src/main/java/com/futurecollars/lesson14/task4/data.txt";

    public static List<String> readNumbersFromFile() {
        List<String> numbers = new ArrayList<>();
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(DATA_PATH))) {
            while ((line = reader.readLine()) != null) {
                if (!line.isEmpty()) {
                    numbers.add(line);
                }
            }
        } catch (IOException ioException) {
            System.err.println("Could not load numbers");
        }
        return numbers;
    }

}

