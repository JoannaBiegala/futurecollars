package com.futurecollars.lesson13.task3;

import java.util.ArrayList;
import java.util.List;

public class GenericList<E> implements OwnList<E> {

    List<E> list = new ArrayList<>(DEFAULT_CAPACITY);

    @Override
    public boolean add(E o) {
        return list.add(o);
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
    public boolean remove(E o) {
        return list.remove(o);
    }

    @Override
    public int size() {
        return list.size();
    }

}
