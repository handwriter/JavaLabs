package ru.mirea.lab11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> intArr = new ArrayList<Integer>(Arrays.asList(1, 2, 5, 10, 25, 33));
        List<Integer> intLinkedArr = new LinkedList<Integer>(Arrays.asList(1, 2, 5, 10, 25, 33));

        long startTime = System.nanoTime();
        intArr.add(3, 3);
        System.out.println("Вставка ArrayList. Время: " + (System.nanoTime() - startTime));
        startTime = System.nanoTime();
        intLinkedArr.add(3, 3);
        System.out.println("Вставка LinkedList. Время: " + (System.nanoTime() - startTime));
        startTime = System.nanoTime();
        intArr.remove(3);
        System.out.println("Удаление ArrayList. Время: " + (System.nanoTime() - startTime));
        startTime = System.nanoTime();
        intLinkedArr.remove(3);
        System.out.println("Удаление LinkedList. Время: " + (System.nanoTime() - startTime));
        startTime = System.nanoTime();
        intArr.add(3);
        System.out.println("Добавление ArrayList. Время: " + (System.nanoTime() - startTime));
        startTime = System.nanoTime();
        intLinkedArr.add(3);
        System.out.println("Добавление LinkedList. Время: " + (System.nanoTime() - startTime));
        startTime = System.nanoTime();
        intArr.indexOf(3);
        System.out.println("Поиск ArrayList. Время: " + (System.nanoTime() - startTime));
        startTime = System.nanoTime();
        intLinkedArr.indexOf(3);
        System.out.println("Поиск LinkedList. Время: " + (System.nanoTime() - startTime));
    }
}
