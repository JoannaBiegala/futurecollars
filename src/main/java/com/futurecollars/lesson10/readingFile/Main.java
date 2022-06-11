package com.futurecollars.lesson10.readingFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        try {
            String text = Files.readString(Path.of("src/main/java/com/futurecollars/lesson10/data.txt"));
            System.out.println(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
