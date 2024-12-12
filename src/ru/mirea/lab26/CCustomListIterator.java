package ru.mirea.lab26;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class CCustomListIterator<T> implements Iterator<T> {
    private CustomList<T> list;
    private int index;

    public CCustomListIterator(CustomList<T> list)
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
        CustomList<String> dd = new CustomList<>();
        dd.add("BBB");
        dd.add("GGG");
        dd.add("MMM");
        Iterator<String> iter = new CCustomListIterator<>(dd);
        while (iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }
}
