package ru.mirea.lab20;

import ru.mirea.lab6.Animal;

import java.io.Serializable;
import java.lang.constant.Constable;

public class TestGeneric<T extends Comparable, K, V extends Animal & Serializable> {
    private T value1;
    private K value2;
    private V value3;

    public TestGeneric(T value1, K value2, V value3)
    {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public T getValue1() {
        return value1;
    }

    public K getValue2() {
        return value2;
    }

    public V getValue3() {
        return value3;
    }

    public void printTypes()
    {
        System.out.println(value1.getClass() + " " + value2.getClass() + " " + value3.getClass());
    }
}
