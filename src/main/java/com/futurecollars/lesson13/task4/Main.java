package com.futurecollars.lesson13.task4;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "ala");
        map.put(2, "kotek");
        map.put(3, "piesek");

        Pair<Integer, String> pair = new Pair<>(map);

        System.out.println("Value of key = 2 is \"" + pair.getValue(2) + "\"");
        System.out.println("Key of value = \"ala\" is " + pair.getKey("ala"));
    }

}
