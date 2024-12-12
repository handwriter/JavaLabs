package ru.mirea.lab26;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class CustomListIterator<T> implements Iterator<T> {
    private List<T> list;
    private int index;

    public CustomListIterator(List<T> list)
    {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public T next() {
        if (!hasNext())
            throw new NoSuchElementException("Error");
        try
        {
            return list.get(index);
        }
        finally {
            index++;
        }
    }

    public static void main(String[] args) {
        List<String> dd = Arrays.asList("dq", "qwdqwd", "qdwwdqw");
        Iterator<String> iter = new CustomListIterator<>(dd);
        while (iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }
}
