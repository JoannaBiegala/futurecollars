package com.futurecollars.lesson10.reverse;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextOrderReverser {

    public static String reverseOrder(String path) throws IOException {
        String reversedText = "";
        File file = new File(path);
        if (!file.exists()) {
            throw new IOException("File " + path + " does not exist");
        }
        try {
            String text = Files.readString(Path.of(path));
            reversedText = new StringBuilder(text).reverse().toString();

        } catch (IOException e) {
            e.getStackTrace();
        }
        return reversedText;
    }

}
