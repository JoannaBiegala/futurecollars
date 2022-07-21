package com.futurecollars.lesson13.task3;

import java.util.ArrayList;
import java.util.List;

public class GenericList<E> implements OwnList<E> {

    List<Object[]> elementsList;
    Object[] elements;
    private int size = 0;

    public GenericList() {
       elements = new Object[DEFAULT_CAPACITY];
       elementsList = new ArrayList<>();
    }

    @Override
    public boolean add(E o) {
        if (size() >= DEFAULT_CAPACITY) {
            Object[] fullArrayOfObjects = elements.clone();
            elementsList.add(fullArrayOfObjects);
            elements = new Object[DEFAULT_CAPACITY];
            elements[0]=o;
            size = 1;
         } else {
            elements[size()] = o;
            size++;
        }
        return true;
    }

    @Override
    public E get(int index) {
        if (index > size()) {
             throw new IndexOutOfBoundsException();
        } else {
            return (E) elements[index];
        }
    }

    @Override
    public boolean remove(E o) {
        for (int index = 0; index < size(); index++) {
            if (elements[index] == o) {
                if (size() - index >= 0) System.arraycopy(elements, index + 1, elements, index, size() - index);
                elements[size() - 1] = null;
                size--;
                return true;
            }

        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

}
