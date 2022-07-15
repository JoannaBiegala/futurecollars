package com.futurecollars.lesson10.everySecondLine;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            EverySecondLineWriter.writeEverySecondLine("src/main/java/com/futurecollars/lesson10/everySecondLine/data.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
