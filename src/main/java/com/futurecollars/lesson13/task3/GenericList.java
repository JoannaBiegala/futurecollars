package com.futurecollars.lesson13.task3;

import java.util.ArrayList;
import java.util.List;

public class GenericList<E> implements OwnList<E> {

    List<E> list;

    public GenericList() {
        list = new ArrayList<>(DEFAULT_CAPACITY);
    }

    @Override
    public boolean add(Object o) {
        return list.add((E) o);
    }

    @Override
    public E get(int index) {
        if (index > size()) {
            return null;
        } else {
            return (list.get(index));
        }
    }

    @Override
    public boolean remove(Object o) {
        return list.remove((E) o);
    }

    @Override
    public int size() {
        return list.size();
    }

}
