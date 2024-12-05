package ru.mirea.lab_lists_2;

class DoubleCircLinkedList {
    Node head;
    Node tail;

    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.next = head;
            head.prev = head;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
            tail = newNode;
        }
    }

    Node removeFirst() {
        if (head == null) return null;
        Node firstNode = head;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
        firstNode.next = null;
        firstNode.prev = null;
        return firstNode;
    }

    void insertInOrder(Node newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node current = head;
            do {
                if (current.data >= newNode.data) {
                    newNode.next = current;
                    newNode.prev = current.prev;
                    current.prev.next = newNode;
                    current.prev = newNode;
                    if (current == head) {
                        head = newNode;
                    }
                    return;
                }
                current = current.next;
            } while (current != head);
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
            tail = newNode;
        }
    }

    void printList() {
        if (head == null) return;
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    public static void main(String[] args) {
        DoubleCircLinkedList originalList = new DoubleCircLinkedList();
        DoubleCircLinkedList newList = new DoubleCircLinkedList();

        originalList.add(3);
        originalList.add(5);
        originalList.add(7);
        originalList.add(2);
        originalList.add(4);

        System.out.println("Original List:");
        originalList.printList();

        Node removedNode;
        while ((removedNode = originalList.removeFirst()) != null) {
            newList.insertInOrder(removedNode);
        }

        System.out.println("New Ordered List:");
        newList.printList();
    }
}