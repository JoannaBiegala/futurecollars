package com.futurecollars.lesson10.readingFile;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(new FileReader().readFileToString("src/main/resources/data.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
