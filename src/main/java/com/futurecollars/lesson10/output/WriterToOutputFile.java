package com.futurecollars.lesson10.output;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriterToOutputFile {

    public static void convertToUppercase(String pathToInputFile, String pathToOutputFile) throws IOException {
        String text = Files.readString(Path.of(pathToInputFile));
        Files.writeString(Paths.get(pathToOutputFile), text.toUpperCase());
    }

}
