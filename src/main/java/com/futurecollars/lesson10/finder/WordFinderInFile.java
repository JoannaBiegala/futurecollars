package com.futurecollars.lesson10.finder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WordFinderInFile {

    public static boolean findWordInFile(String path, String word) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            throw new FileNotFoundException("File " + path + " does not exist");
        }
        String text = Files.readString(Path.of(path));
        return text.contains(word);
    }

}