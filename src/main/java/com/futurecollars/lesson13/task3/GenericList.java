package com.futurecollars.lesson13.task3;

import java.util.ArrayList;
import java.util.List;

public class GenericList<E> implements OwnList<E> {

    List<Object[]> elementsList;
    Object[] elements;
    private int sizeCurrentArray = 0;

    public GenericList() {
        elements = new Object[DEFAULT_CAPACITY];
        elementsList = new ArrayList<>();
        elementsList.add(elements);
    }

    @Override
    public boolean add(E o) {
        if (sizeCurrentArray >= DEFAULT_CAPACITY) {
            elements = new Object[DEFAULT_CAPACITY];
            elementsList.add(elements);
            elements[0] = o;
            sizeCurrentArray = 1;
        } else {
            elements[sizeCurrentArray] = o;
            sizeCurrentArray++;
        }
        return true;
    }

    @Override
    public E get(int index) {
        if (index > size()) {
            throw new IndexOutOfBoundsException();
        } else {
                int indexInElementsList = index / DEFAULT_CAPACITY;
                int positionOfElements = index % DEFAULT_CAPACITY;
                return (E) elementsList.get(indexInElementsList)[positionOfElements];
        }
    }

    @Override
    public boolean remove(E o) {
        for (int index = 0; index < size(); index++) {
            int indexInElementsList = index / DEFAULT_CAPACITY;
            int positionOfElements = index % DEFAULT_CAPACITY;
            if (elementsList.get(indexInElementsList)[positionOfElements] == o) {
               if (indexInElementsList == 0) {
                   if (size() - index >= 0) System.arraycopy(elements, index + 1, elements, index, size() - index);
                   elements[size() - 1] = null;
                   sizeCurrentArray--;
                   return true;
               }
            }

        }
        return false;
    }

    @Override
    public int size() {
        return (elementsList.size() - 1) * 10 + sizeCurrentArray;
    }

}
