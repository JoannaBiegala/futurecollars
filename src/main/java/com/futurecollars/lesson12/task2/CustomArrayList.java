package com.futurecollars.lesson12.task2;

import java.util.ArrayList;

public class CustomArrayList implements OwnList, Comparable<CustomArrayList> {

    private ArrayList<Integer> elements;
    private int size;

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }


    public void add(Integer element) {
        elements.add(element);
        size++;

    }

    @Override
    public Integer get(int i) {
        return elements.get(i);
    }


    @Override
    public void add(int index, Integer element) {
        this.add(index, element);
    }

    @Override
    public Integer remove(int index) {
        if (index>this.size()){
            throw new IllegalArgumentException("Index greater than the size of the list");
        }
        Integer value = this.get(index);
        this.remove(index);
        return value;
    }

    @Override
    public int compareTo(CustomArrayList o) {
        return 0;
    }

}
