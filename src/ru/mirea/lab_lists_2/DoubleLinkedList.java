package ru.mirea.lab_lists_2;

public class DoubleLinkedList {
    Node head;
    Node tail;

    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    Node removeMin() {
        if (head == null) return null;
        Node minNode = head;
        Node current = head;
        while (current != null) {
            if (current.data < minNode.data) {
                minNode = current;
            }
            current = current.next;
        }

        if (minNode == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        } else if (minNode == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            minNode.prev.next = minNode.next;
            minNode.next.prev = minNode.prev;
        }

        minNode.next = null;
        minNode.prev = null;
        return minNode;
    }

    void insertAtBeginning(Node newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void sort() {
        DoubleLinkedList sortedList = new DoubleLinkedList();
        Node minNode;
        while ((minNode = removeMin()) != null) {
            sortedList.insertAtBeginning(minNode);
        }
        head = sortedList.head;
        tail = sortedList.tail;
    }

    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
