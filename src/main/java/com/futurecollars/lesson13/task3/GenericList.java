package com.futurecollars.lesson13.task3;

public class GenericList<E> implements OwnList<E> {

    Object[] elements;
    private int size = 0;

    public GenericList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public boolean add(E o) {
        if (size() > DEFAULT_CAPACITY) {
            return false;
        } else {
            elements[size()] = o;
            size++;
            return true;
        }
    }

    @Override
    public E get(int index) {
        if (index > size()) {
            return null;
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
