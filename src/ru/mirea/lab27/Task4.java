package ru.mirea.lab27;

import java.io.Console;
import java.util.PriorityQueue;

public class Task4 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(6);
        queue.add(10);
        queue.add(3);
        System.out.println(queue.poll());
    }
}
