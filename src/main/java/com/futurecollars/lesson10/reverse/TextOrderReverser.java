package com.futurecollars.lesson10.reverse;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextOrderReverser {

    String reverseOrder(String path) {
        String reversedText = "";
        File file = new File(path);
        if (!file.exists()) {
            return "File " + path + " does not exist";
        }
        try {
            String text = Files.readString(Path.of(path));

            for (int index = text.length(); index > 0; index--) {
                reversedText += text.charAt(index - 1);
            }

        } catch (IOException e) {
            e.getStackTrace();
        }
        return reversedText;
    }

}
