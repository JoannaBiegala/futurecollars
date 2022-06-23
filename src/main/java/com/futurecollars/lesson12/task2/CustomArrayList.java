package com.futurecollars.lesson12.task2;

import java.util.Arrays;

public class CustomArrayList implements OwnList {

    private final int initialSize;
    private final Integer[] array;
    private int size;

    public CustomArrayList(int initialSize) {
        this.initialSize = initialSize;
        array = new Integer[initialSize];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public void add(Integer element) {
        if (size >= initialSize)
            throw new IllegalArgumentException("Full list, you can't add item any more");
        array[size] = element;
        size++;
    }

    @Override
    public Integer get(int index) {
        if (index > size)
            throw new IllegalArgumentException("Index greater than the size of the list");
        return array[index];
    }

    @Override
    public void add(int index, Integer element) {
        if (index > size)
            throw new IllegalArgumentException("Index greater than the size of the list");
        array[index] = element;
    }

    @Override
    public Integer remove(int index) {
        if (index > size - 1) {
            throw new IllegalArgumentException("Index greater than the size of the list");
        }
        Integer value = array[index];
        int i = index;
        while (i < size - 1) {
            array[i] = array[i + 1];
            i++;
        }
        array[size - 1] = null;
        size--;
        return value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

}
