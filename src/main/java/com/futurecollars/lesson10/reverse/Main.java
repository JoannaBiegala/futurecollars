package com.futurecollars.lesson10.reverse;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            System.out.println(TextOrderReverser.reverseOrder("src/main/java/com/futurecollars/lesson10/reverse/data.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
