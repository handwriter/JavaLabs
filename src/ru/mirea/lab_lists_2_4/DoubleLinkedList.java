package ru.mirea.lab_lists_2_4;

public class DoubleLinkedList {
    Node head;
    Node tail;

    void insertInOrder(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node current = head;
            while (current != null) {
                if (data.length() < current.data.length() ||
                        (data.length() == current.data.length() && data.compareTo(current.data) < 0)) {
                    newNode.next = current;
                    newNode.prev = current.prev;
                    if (current.prev != null) {
                        current.prev.next = newNode;
                    } else {
                        head = newNode;
                    }
                    current.prev = newNode;
                    return;
                }
                if (current.next == null) {
                    current.next = newNode;
                    newNode.prev = current;
                    tail = newNode;
                    return;
                }
                current = current.next;
            }
        }
    }

    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

        // Добавление строк в список
        list.insertInOrder("apple");
        list.insertInOrder("banana");
        list.insertInOrder("pear");
        list.insertInOrder("grape");
        list.insertInOrder("kiwi");

        System.out.println("List:");
        list.printList();

        // Добавление новых строк в список
        list.insertInOrder("cherry");
        list.insertInOrder("fig");
        list.insertInOrder("date");

        System.out.println("Updated List:");
        list.printList();
    }
}
