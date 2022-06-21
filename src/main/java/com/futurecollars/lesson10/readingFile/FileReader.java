package com.futurecollars.lesson10.readingFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReader {

    String readFileToString(String path) throws IOException {
        return Files.readString(Path.of(path));
    }

}
