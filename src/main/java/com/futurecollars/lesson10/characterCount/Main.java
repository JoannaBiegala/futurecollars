package com.futurecollars.lesson10.characterCount;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            int counter = CharacterCounter.countCharacters("src/main/java/com/futurecollars/lesson10/characterCount/data.txt");
            System.out.println("There are " + counter + " characters in the file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
