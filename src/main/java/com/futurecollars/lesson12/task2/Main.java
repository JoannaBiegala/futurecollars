package com.futurecollars.lesson12.task2;

public class Main {

    public static void main(String[] args) {

        CustomArrayList customList = new CustomArrayList(10);
        customList.add(2);
        customList.add(3);
        customList.add(7);
        customList.add(5);

        System.out.println("Size:" + customList.size());

    }
}
