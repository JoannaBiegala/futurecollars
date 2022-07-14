package com.futurecollars.lesson15.task5;

import java.util.Arrays;
import java.util.List;

public class WordDisplay {

    public static void displayWords(List<String> words) {
        words
                .stream()
                .map(o1 -> o1.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .filter(x -> !x.contains(","))
                .map(String::toUpperCase)
                .forEach(System.out::print);
    }

}
