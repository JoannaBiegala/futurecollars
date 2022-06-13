package com.futurecollars.lesson10.output;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/main/java/com/futurecollars/lesson10/output/data.txt");
        if (!file.exists()) {
            System.out.println("File does not exist");
        }
        new WriterToOutputFile().convertToUppercase("src/main/java/com/futurecollars/lesson10/output/data.txt",
                "src/main/java/com/futurecollars/lesson10/output/output.txt");
        System.out.println("Text has been saved to the file");
    }
}
