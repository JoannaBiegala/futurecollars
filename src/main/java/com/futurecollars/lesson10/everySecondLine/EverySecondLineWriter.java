package com.futurecollars.lesson10.everySecondLine;

import java.io.*;
import java.util.Arrays;

public class EverySecondLineWriter {

    void writeEverySecondLine(String path) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            int numberLine = 1;
            while ((line = bufferedReader.readLine()) != null) {
                if (numberLine % 2 == 0) {
                    System.out.println(line);
                }
                numberLine++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File " + path + " does not exist");
        } catch (IOException e) {
            System.out.println("IOException: " + Arrays.toString(e.getStackTrace()));
        }
    }

}
