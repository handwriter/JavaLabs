package ru.mirea.lab_lists_2;

public class Task2 {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(5);
        System.out.println("Original List:");
        list.printList();
        list.sort();
        System.out.println("Sorted List:");
        list.printList();
    }
}
