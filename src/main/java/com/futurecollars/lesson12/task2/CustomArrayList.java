package com.futurecollars.lesson12.task2;

import java.util.ArrayList;

public class CustomArrayList implements OwnList, Comparable<CustomArrayList>  {

    private int size;

    public CustomArrayList() {
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return this.isEmpty();
    }


    public void add(Integer element) {
        this.add(size+1,element);
        size++;
    }

    @Override
    public Integer get(int i) {
        return this.get(i);
    }

    @Override
    public void add(int index, Integer element) {
        this.add(index, element);
    }

    @Override
    public Integer remove(int index){
        if (index>this.size()){
            throw new IllegalArgumentException("Index greater than the size of the list");
        }
        Integer value = this.get(index);
        this.remove(index);
        for (int i = index; i < size -1 ; i++) {
             this.add(i, this.get(i+1));
        }
        size--;
        return value;
    }

    @Override
    public int compareTo(CustomArrayList o) {
        return 0;
    }

}
