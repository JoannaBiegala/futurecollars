package com.futurecollars.lesson10.characterCount;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CharacterCounter {

    int countCharacters(String path) {
        String text = "";
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("File " + path + " does not exist");
        }
        try {
            text = Files.readString(Path.of(path));
        } catch (IOException e) {
            e.getStackTrace();
        }
        return text.length();
    }

}