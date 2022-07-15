package com.futurecollars.lesson10.finder;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String word = "Pliki";
        try {
            if (WordFinderInFile.findWordInFile("src/main/java/com/futurecollars/lesson10/finder/data.txt", word)) {
                System.out.println("The word \"" + word + "\" appears in the file");
            } else {
                System.out.println("The word \"" + word + "\" not appears in the file");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
