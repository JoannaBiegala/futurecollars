package com.futurecollars.lesson13.task1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

       OwnHashMap<String,String> ownHashMap = new OwnHashMap<>();
       ownHashMap.put("Ala","kot");
       ownHashMap.put("Olek","pies");
        ownHashMap.put("Kasia","papuga");
        ownHashMap.put("Magda","kanarek");
        ownHashMap.put("Iza","rybka");

        System.out.println(ownHashMap.get("LMagda"));
        System.out.println(ownHashMap.containsKey("KMagda"));
        System.out.println(ownHashMap.containsValue("Lpapuga"));
        System.out.println(ownHashMap.remove("DKasia"));


    }
}
