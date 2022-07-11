package com.futurecollars.lesson13.task5;

public class BubbleSort<E extends Comparable<E>> {

    E[] table;

    public BubbleSort(E[] table) {
        this.table = table;
    }

    public boolean compareTo(E e1, E e2) {
        return e1.compareTo(e2) > 0;
    }

    public void bubbleSort() {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length - 1; j++) {
                if (compareTo(table[j], table[j + 1])) {
                    E temp = table[j + 1];
                    table[j + 1] = table[j];
                    table[j] = temp;
                }
            }
        }
    }

}
