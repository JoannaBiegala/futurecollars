package com.futurecollars.lesson10.output;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            WriterToOutputFile.convertToUppercase("src/main/java/com/futurecollars/lesson10/output/data.txt",
                    "src/main/java/com/futurecollars/lesson10/output/output.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Text has been saved to the file");
    }
}
