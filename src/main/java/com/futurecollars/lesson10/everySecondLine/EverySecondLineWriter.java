package com.futurecollars.lesson10.everySecondLine;

import java.io.*;

public class EverySecondLineWriter {

    public static void writeEverySecondLine(String path) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String line;
        int numberLine = 1;
        while ((line = bufferedReader.readLine()) != null) {
            if (numberLine % 2 == 0) {
                System.out.println(line);
            }
            numberLine++;
        }
    }

}
