package com.futurecollars.lesson14.task4;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String,String> patterns = new HashMap<>();
        patterns.put("Liczby całkowite: ","\\d+");
        patterns.put("Liczby zmiennoprzecinkowe: ","\\d+[.]+\\d+");
        patterns.put("liczby w notacji naukowej: ","\\d+[.]+\\d+\\D+\\d+");

        NumbersSelectedByPattern numbersSelectedByPattern = new NumbersSelectedByPattern(patterns);
        numbersSelectedByPattern.readNumbersFromFile();
        numbersSelectedByPattern.validateNumbers();
    }

}
