package com.futurecollars.lesson10.finder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WordFinderInFile {

    boolean findWordInFile(String path, String word) {
        String text = "";
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("File " + path + " does not exist");
            return false;
        }
        try {
           text = Files.readString(Path.of(path));
        } catch (IOException e) {
            e.getStackTrace();
        }
        return text.contains(word);
    }

}