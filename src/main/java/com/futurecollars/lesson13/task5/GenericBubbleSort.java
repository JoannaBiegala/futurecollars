package com.futurecollars.lesson13.task5;

import java.util.Arrays;

public class GenericBubbleSort<T> {

    T[] table;

    public GenericBubbleSort(T[] table) {
        this.table = table;
    }

    public void bubbleSort() {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length - 1; j++) {
                if (table[j].hashCode() > table[j + 1].hashCode()) {
                    T temp = table[j + 1];
                    table[j + 1] = table[j];
                    table[j] = temp;
                }
            }
        }
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(table);
    }

}
