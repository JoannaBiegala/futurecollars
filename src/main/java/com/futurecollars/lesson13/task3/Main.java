package com.futurecollars.lesson13.task3;

public class Main {

    public static void main(String[] args) {
        GenericList<String> genericList = new GenericList<>();
        genericList.add("Ala");
        genericList.add("Ola");
        genericList.add("Zosia");
        System.out.println("Element of index 2 = " + genericList.get(2));
        System.out.println("size of list = " + genericList.size());
    }

}
