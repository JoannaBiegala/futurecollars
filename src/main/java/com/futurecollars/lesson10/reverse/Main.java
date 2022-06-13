package com.futurecollars.lesson10.reverse;

public class Main {

    public static void main(String[] args) {
        String text = new TextOrderReverser().reverseOrder("src/main/java/com/futurecollars/lesson10/reverse/data.txt");
        System.out.println(text);
    }

}
