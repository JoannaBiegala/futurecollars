package com.futurecollars.lesson15.task5;

import java.util.Arrays;
import java.util.List;

public class WordDisplayer {

    public static void displayWords(List<String> words) {
        words
                .stream()
                .map(o1 -> o1.split(""))
                .flatMap(Arrays::stream)
                .filter(x -> !x.contains(","))
                .map(String::toUpperCase)
                .distinct()
                .forEach((k) -> System.out.print(k + " "));
    }

}
