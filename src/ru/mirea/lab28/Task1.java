package ru.mirea.lab28;

import java.util.HashSet;
import java.util.TreeSet;

public class Task1 {
    public static <T> TreeSet<T> hashToTree(HashSet<T> hashSet)
    {
        return new TreeSet<>(hashSet);
    }
}
