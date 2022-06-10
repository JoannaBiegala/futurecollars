package com.futurecollars.lesson10.data;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        FileWriter fileWriter = new FileWriter();
        File file = new File("C:\\Users\\PC\\IdeaProjects\\futurecollars\\src\\main\\java\\com\\futurecollars\\lesson10\\data.txt");
        String text = "Kurs\n" +
                "Java\n" +
                "Lekcja 6\n" +
                "Pliki\n" +
                "Wyjątki\n" +
                "Pliki\n" +
                "Koniec pliku";
        fileWriter.writeToFile(file.getPath(), text);
    }
}