package com.futurecollars.lesson10.readingFile;

public class Main {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        String text = fileReader.readFileToString("src/main/java/com/futurecollars/lesson10/data.txt");
        System.out.println(text);
    }

}
