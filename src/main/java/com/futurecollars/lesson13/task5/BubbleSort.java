package com.futurecollars.lesson13.task5;

public class BubbleSort {

    public static <E extends Comparable> void bubbleSort(E[] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length - 1; j++) {
                if (table[j].compareTo(table[j + 1]) > 0) {
                    E temp = table[j + 1];
                    table[j + 1] = table[j];
                    table[j] = temp;
                }
            }
        }
    }


}
