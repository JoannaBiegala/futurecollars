package com.futurecollars.lesson13.task3;

public class Main {

    public static void main(String[] args) {
        GenericList<String> genericList = new GenericList<>();
        genericList.add("Ala");
        genericList.add("Ola");
        genericList.add("Zosia");
        genericList.add("Alek");
        genericList.add("Olek");
        genericList.add("Zosieńka");
        genericList.add("Alusia");
        genericList.add("Oleńka");
        genericList.add("Kasia");
        genericList.add("Basia");
        genericList.add("Krysia");
        genericList.add("Zenek");
        genericList.add("Aleksander");
        genericList.add("Olga");
        genericList.add("Zbyszek");
        System.out.println("Element of index 2 = " + genericList.get(2));
        System.out.println("Element of index 12 = " + genericList.get(12));
        System.out.println("size of list = " + genericList.size());
    }

}
