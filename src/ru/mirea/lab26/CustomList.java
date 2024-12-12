package ru.mirea.lab26;

import java.util.Arrays;

public class CustomList<E> {
    private Object elements[];

    public CustomList() {
        elements = new Object[0];
    }

    public void add(E e) {
        upSize();
        elements[elements.length - 1] = e;
    }

    private void upSize()
    {
        Object[] tmpArray = new Object[elements.length + 1];
        System.arraycopy(elements, 0, tmpArray, 0, elements.length);
        elements = tmpArray;
    }

    public E get(int i) {
        if (i >= elements.length || i < 0) {
            throw new IndexOutOfBoundsException("Error");
        }
        return (E) elements[i];
    }

    public void remove(int i) {
        if (i >= elements.length || i < 0 || elements.length == 0) {
            throw new IndexOutOfBoundsException("Error");
        }
        Object[] tmpArray = new Object[elements.length - 1];
        System.arraycopy(elements, 0, tmpArray, 0, i + 1);
        System.arraycopy(elements, i + 1, tmpArray, i+1, elements.length - i + 1);
    }

    public int size()
    {
        return elements.length;
    }

    @Override
    public String toString() {
        return "CustomList: [" + Arrays.stream(elements) + "]";
    }


}