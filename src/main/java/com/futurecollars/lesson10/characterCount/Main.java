package com.futurecollars.lesson10.characterCount;

public class Main {

    public static void main(String[] args) {
        int counter = new CharacterCounter().countCharacters("src/main/java/com/futurecollars/lesson10/characterCount/data.txt");
        System.out.println("There are " + counter + " characters in the file");
    }

}
