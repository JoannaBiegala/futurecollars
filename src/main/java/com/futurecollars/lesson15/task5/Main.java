package com.futurecollars.lesson15.task5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("Ala,Basia,Grzegorz,Kasia,Ula"));
        WordDisplayer.displayWords(words);
    }

}
