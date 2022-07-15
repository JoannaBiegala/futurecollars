package com.futurecollars.lesson10.characterCount;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CharacterCounter {

    public static int countCharacters(String path) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            throw new FileNotFoundException("File " + path + " does not exist");
        }
        String text = Files.readString(Path.of(path));
        return text.length();
    }

}