package com.futurecollars.lesson10.readingFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReader {

    String readFileToString(String path) {
        String text = "";
        try {
            File file = new File(path);
            if (!file.exists()){
                return "File " + path + " does not exist";
            }
            text = Files.readString(Path.of(path));
        } catch (IOException e) {
            e.getStackTrace();
        }
        return text;
    }

}
