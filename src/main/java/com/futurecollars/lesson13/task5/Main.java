package com.futurecollars.lesson13.task5;

public class Main {

    public static void main(String[] args) {
        Integer[] table = {23, 55, 12, 78, 56, 33, 55};
        BubbleSort<Integer> bubbleSort = new BubbleSort<>(table);
        bubbleSort.bubbleSort();
        for (int element : table) {
            System.out.println(element);
        }
    }

}
