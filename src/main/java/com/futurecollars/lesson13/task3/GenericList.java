package com.futurecollars.lesson13.task3;

import java.util.ArrayList;
import java.util.List;

public class GenericList<E> implements OwnList{

    private static final int DEFAULT_CAPACITY = 10;

    public E element;
    List<E> list;

    public GenericList() {
        list = new ArrayList<E>(DEFAULT_CAPACITY);
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
