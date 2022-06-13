package com.futurecollars.lesson10.finder;

public class Main {

    public static void main(String[] args) {
        String word = "Pliki";
        boolean isContained =  new WordFinderInFile().findWordInFile("src/main/java/com/futurecollars/lesson10/finder/data.txt",word);
        if (isContained) {
            System.out.println("The word \"" + word + "\" appears in the file");
        } else {
            System.out.println("The word \"" + word + "\" not appears in the file");
        }
    }

}
